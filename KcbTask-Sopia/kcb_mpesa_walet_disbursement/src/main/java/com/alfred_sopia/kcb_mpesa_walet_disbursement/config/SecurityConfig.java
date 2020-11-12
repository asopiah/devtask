package com.alfred_sopia.kcb_mpesa_walet_disbursement.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @Created on 12:35 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //Configure session management
        http.sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // Disbaled login and logout pages
        http.logout().disable();
        http.formLogin().disable();

        //Disable Basic HTTP authentication
        http.httpBasic().disable();
        //Disable anonymous access
        http.anonymous().disable();

        //Authorizing requests by HTTP methods
        http.authorizeRequests()
                .antMatchers("/api/").access("#oauth2.hasScope('get')")
                .antMatchers("/api/").access("#oauth2.hasScope('post')")
                .antMatchers("/api/").access("#oauth2.hasScope('put')")
                .anyRequest().authenticated()
                .anyRequest().denyAll();
    }
}
