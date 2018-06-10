package com.sbf.api.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//oauth/authorize for authorize it is open 
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.sessionManagement()
		
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		//For Protect all Resource URL 
		http.authorizeRequests()
			.anyRequest().authenticated()
			/*To set Limit access by using Scope*/
			.antMatchers("/api/public").access("#oauth2.hasScope('read')");
		
		//permit all mean open to security
		//authenticated mean protect
	}
}
