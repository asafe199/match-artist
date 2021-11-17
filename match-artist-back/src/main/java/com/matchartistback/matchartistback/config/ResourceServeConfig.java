package com.matchartistback.matchartistback.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.ClientDetailsService;

//@SuppressWarnings("deprecation")
//@Configuration
//@EnableWebSecurity
public class ResourceServeConfig extends WebSecurityConfigurerAdapter{
//	 @Override
//	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	        auth.inMemoryAuthentication()
//	                .withUser("admin@algamoney.com")
//	                .password("admin")
//	                .roles("ROLE");
//	    }
//
//	    @Override
//	    public void configure(HttpSecurity http) throws Exception {
//	        
//	        http.authorizeRequests()
//	                .antMatchers("/categorias").permitAll()
//	                .anyRequest().authenticated()
//	            .and()
//	                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//	            .and()
//	                .csrf().disable()
//	                .oauth2ResourceServer().jwt().jwtAuthenticationConverter(jwtAuthenticationConverter());
//	    }
//
//	    @Bean
//	    public JwtDecoder jwtDecoder() {
//	        var secretKey = new SecretKeySpec("3032885ba9cd6621bcc4e7d6b6c35c2b".getBytes(), "HmacSHA256");
//
//	        return NimbusJwtDecoder.withSecretKey(secretKey).build();
//	    }
//	    
//	    @Bean
//	    @Override
//	    protected AuthenticationManager authenticationManager() throws Exception {        
//	        return super.authenticationManager();
//	    }
//
//	    @Bean
//	    public PasswordEncoder passwordEncoder() {
//	        return NoOpPasswordEncoder.getInstance();
//	    }
//	    
//	    private JwtAuthenticationConverter jwtAuthenticationConverter() {
//			JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
//			jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(jwt -> {
//				List<String> authorities = jwt.getClaimAsStringList("authorities");
//
//				if (authorities == null) {
//					authorities = Collections.emptyList();
//				}
//
//				JwtGrantedAuthoritiesConverter scopesAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();
//				Collection<GrantedAuthority> grantedAuthorities = scopesAuthoritiesConverter.convert(jwt);
//
//				grantedAuthorities.addAll(authorities.stream()
//						.map(SimpleGrantedAuthority::new)
//						.collect(Collectors.toList()));
//
//				return grantedAuthorities;
//			});
//
//			return jwtAuthenticationConverter;
//		}

}
