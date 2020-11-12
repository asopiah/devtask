package com.alfred_sopia.kcb_mpesa_walet_disbursement.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Created on 12:32 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class ChannelSecurityConfig extends WebSecurityConfigurerAdapter {
    //Enforce HTTPS
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requiresChannel().anyRequest().requiresSecure();
        http.headers().httpStrictTransportSecurity();
        // ...
    }
}
