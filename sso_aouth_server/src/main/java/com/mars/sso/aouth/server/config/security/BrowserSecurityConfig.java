package com.mars.sso.aouth.server.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public AuthenticationSuccessHandler configAuthenticationSuccessHandler;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .successHandler(configAuthenticationSuccessHandler)
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
