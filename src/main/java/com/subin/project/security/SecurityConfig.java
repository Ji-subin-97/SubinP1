package com.subin.project.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	// 스프링 시큐리티 앞단 설정
	@Override
	public void configure(WebSecurity web) throws Exception {
		
		web.ignoring()
			.antMatchers("/css/**")
			.antMatchers("/js/**");
	}
	
	// 스프링 시큐리티 설정
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/").permitAll();
	}
	
}
