package com.matchartist.backend.config;

import java.util.Arrays;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

//@Configuration
//public class Cors implements Filter{
//	
//	
//		@Bean
//	    public CorsFilter corsConfigurationSource() {
//	        CorsConfiguration configuration = new CorsConfiguration();
//	        configuration.setAllowedOrigins(Arrays.asList("*"));
//	        configuration.addAllowedHeader("*");
//	        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
//	        configuration.setAllowedHeaders(Arrays.asList("authorization", "content-type", "x-auth-token"));
//	        configuration.setExposedHeaders(Arrays.asList("x-auth-token"));
//	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	        source.registerCorsConfiguration("/**", configuration);
//	        return new CorsFilter(source);
//	    }
//
//}
