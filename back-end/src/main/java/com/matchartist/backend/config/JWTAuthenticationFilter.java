package com.matchartist.backend.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.matchartist.backend.model.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import static com.matchartist.backend.config.Token.*;


public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {


	private AuthenticationManager authenticationManager = null;

    public JWTAuthenticationFilter(AuthenticationManager auth) {
		this.authenticationManager = auth;
	}

	@Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
        try {
            Usuario user = new ObjectMapper().readValue(request.getInputStream(), Usuario.class);
            return this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException {
        Usuario username =  (Usuario)authResult.getPrincipal();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, 3);
        String token = Jwts
                .builder()
                .setSubject(username.getUsername())
                .setExpiration(calendar.getTime())
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        String bearerToken = BEARER + token;
        Map<String, Object> map = new HashMap<>();
        map.put("JWT", bearerToken);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().println(new ObjectMapper().writeValueAsString(map));
        response.addHeader(AUTH, bearerToken);
    }
}
