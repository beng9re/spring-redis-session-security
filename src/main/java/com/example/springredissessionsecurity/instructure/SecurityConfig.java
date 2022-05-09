package com.example.springredissessionsecurity.instructure;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity //시큐리티 설정 //Cofigureation 설정
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	@Override
	public void configure(WebSecurity web) throws Exception {
		//WebSecurity를 설정할 수 있다. 특정 요청을 무시하거나 할 수 있다.
		super.configure(web);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//HttpSecurity를 설정할 수 있다. 접근권한, 로그인 등등 요청 경로 지정가능
		http.authorizeRequests()
				.antMatchers("api/v1/*").permitAll()
				.antMatchers("h2-console/**").permitAll()
		;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//사용자 인증 정보를 구성한다. inmemory 기반 유저를 생성할 수 있다.
		super.configure(auth);
	}

}
