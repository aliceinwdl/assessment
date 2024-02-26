package com.kbtg.bootcamp.posttest.securityconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

import static org.springframework.security.config.Customizer.withDefaults;


@Component
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
                http.authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/lotteries/**").permitAll()
                        .requestMatchers("/users/**").permitAll()
                        .anyRequest().authenticated());
        http.httpBasic(withDefaults());
        return http.build();
    }
}
