package com.matchartist.backend.config;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig
//		extends WebSecurityConfigurerAdapter
{
	
//	//	quais rotas estaram publicas
//	private static final String[] PUBLIC_MATCHERS = {
//		"/**"
//	};
//
//	//apenas leitura
//	private static final String[] PUBLIC_MATCHERS_GET = {
//			"/**"
//		};
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception{
//		http.cors().and().csrf().disable();
//		http.authorizeRequests()
//			.antMatchers(HttpMethod.GET, PUBLIC_MATCHERS_GET).permitAll()
//			.antMatchers(PUBLIC_MATCHERS).permitAll()
//			.anyRequest().authenticated();			 // para todo resto exige autenticação
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//	}
//
//	@Bean
//	CorsConfigurationSource corsConfigurationSource() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
//        return source;
//	}
//
//	@Bean
//	public BCryptPasswordEncoder bCryptPasswordEncoder() {
//
//		return new BCryptPasswordEncoder();
//	}

}
