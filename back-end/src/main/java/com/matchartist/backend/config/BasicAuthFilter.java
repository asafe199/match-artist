package com.matchartist.backend.config;

import com.matchartist.backend.impl.UsuarioServiceImpl;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.matchartist.backend.config.Token.*;

public class BasicAuthFilter extends OncePerRequestFilter {

    private final UsuarioServiceImpl usuarioService;

    public BasicAuthFilter(UsuarioServiceImpl usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain) throws IOException, ServletException {
        String header = request.getHeader(AUTH);
        if (header == null || !header.startsWith(BEARER)) {
            chain.doFilter(request, response);
            return;
        }
        UsernamePasswordAuthenticationToken authenticationToken = getAuthenticationToken(request);
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        chain.doFilter(request, response);
    }

    private UsernamePasswordAuthenticationToken getAuthenticationToken(HttpServletRequest request) {
        String token = request.getHeader(AUTH);
        if (token == null) return null;
        String username = Jwts.parser().setSigningKey(SECRET)
                .parseClaimsJws(token.replace(BEARER, ""))
                .getBody()
                .getSubject();
        UserDetails userDetails = usuarioService.loadUserByUsername(username);
        return username != null ? new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities()) : null;
    }
}
