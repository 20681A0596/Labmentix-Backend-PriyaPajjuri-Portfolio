package com.portfolio.cms.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/*
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/*
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // disable CSRF
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/**").permitAll() // allow /auth endpoints
                        .anyRequest().authenticated()           // secure everything else
                );
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/auth/**").permitAll()        // allow login/signup
                .antMatchers("/admin/**").hasRole("ADMIN")  // restrict admin routes
                .anyRequest().authenticated()
                .and()
                .formLogin().disable();                     // disable default login form
    }
}

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/**").permitAll()        // allow login/signup
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .antMatchers("/education/**").permitAll()   // allow Education API
                        .antMatchers("/projects/**", "/skills/**", "/blogs/**",
                                "/experience/**", "/testimonials/**", "/services/**")
                        .permitAll()
                        .anyRequest().authenticated()
                        .and()
                        .formLogin().disable();
    }// restrict admin routes
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.disable());                // disable default login form
        return http.build();
    }
}

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/auth/**").permitAll()        // allow login/signup
                .antMatchers("/upload/**").hasRole("ADMIN") // restrict uploads
                .antMatchers("/contact").permitAll()        // allow contact form
                .antMatchers("/admin/**").hasRole("ADMIN")  // restrict admin routes
                .antMatchers("/projects/**", "/skills/**", "/blogs/**", "/about/**",
                        "/experience/**", "/testimonials/**", "/services/**")
                .permitAll()                                // allow public content
                .anyRequest().authenticated()
                .and()
                .formLogin().disable();
    }
}


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/**").permitAll()        // allow login/signup
                        .requestMatchers("/contact").permitAll()        // allow contact form
                        .requestMatchers("/education/**").permitAll()   // allow Education API
                        .requestMatchers("/projects/**", "/skills/**", "/blogs/**",
                                "/experience/**", "/testimonials/**", "/services/**",
                                "/about/**").permitAll()       // public portfolio content
                        .requestMatchers("/upload/**").hasRole("ADMIN") // restrict uploads
                        .requestMatchers("/admin/**").hasRole("ADMIN")  // restrict admin routes
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.disable());                 // disable default login form
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()                           // disable CSRF for APIs
                .authorizeRequests()
                // ✅ Public endpoints (no token required)
                .antMatchers("/auth/**").permitAll()        // login, refresh
                .antMatchers("/contact").permitAll()        // contact form
                .antMatchers("/about/**").permitAll()       // about section
                .antMatchers("/skills/**", "/projects/**",
                        "/blogs/**", "/experience/**",
                        "/testimonials/**", "/services/**")
                .permitAll()
                // ✅ Protected endpoints (require JWT)
                .antMatchers("/upload/**", "/admin/**").hasRole("ADMIN")
                // ✅ Everything else requires authentication
                .anyRequest().authenticated()
                .and()
                .formLogin().disable();                     // disable default login form
    }
}*/
/*

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        // Public endpoints
                        .requestMatchers("/auth/**").permitAll()
                        .requestMatchers("/messages").permitAll()
                        .requestMatchers("/about/**").permitAll()
                        .requestMatchers("/skills/**", "/projects/**",
                                "/blogs/**", "/experience/**",
                                "/education/**", "/media/**").permitAll()
                        // Protected endpoints
                        .requestMatchers("/upload/**", "/admin/**").hasRole("ADMIN")
                        // Everything else
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.disable()); // disable default login form
        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}*/
 // use your actual package name
/*
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors().and().csrf().disable()
                .authorizeHttpRequests(auth -> auth
                        // Public endpoints
                        .requestMatchers("/auth/**").permitAll()
                        .requestMatchers("/mwssage/**").permitAll()
                        .requestMatchers("/about/**").permitAll()
                        .requestMatchers("/skills/**", "/projects/**",
                                "/blogs/**", "/experience/**",
                                "/education/**", "/media/**").permitAll()
                        // Protected endpoints
                        .requestMatchers("/upload/**", "/admin/**").hasRole("ADMIN")
                        // API endpoints open for frontend
                        .requestMatchers("/api/**").permitAll()
                        // Everything else
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.disable()); // disable default login form

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .cors(cors -> cors.disable())
                .authorizeHttpRequests(auth -> auth
                        // Public endpoints
                        .requestMatchers("/auth/**").permitAll()
                        .requestMatchers("/message/**").permitAll()
                        .requestMatchers("/about/**").permitAll()
                        .requestMatchers("/skills/**", "/projects/**",
                                "/blogs/**", "/experience/**",
                                "/education/**", "/media/**").permitAll()
                        // Protected endpoints
                        .requestMatchers("/upload/**", "/admin/**").hasRole("ADMIN")
                        // API endpoints open for frontend
                        .requestMatchers("/api/**").permitAll()
                        // Everything else
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.disable()); // disable default login form

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}



