package com.springSecurity;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@EnableWebSecurity 
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication()
		.withUser("padmanav")
		.password("{bcrypt}$2a$10$P9x58JgrewQpA0PKddiOIO4WXYac.bYhkbAhBLeKimMGqlC2Is5hq")
		.roles("admin");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/bye","/good").authenticated()
		.antMatchers("/helloWorld").permitAll()
		.and()
		.formLogin()
		.and()
		.httpBasic();
	}	
}