// package com.deepak.employee_management_system.service;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
// public class WebSecurityConfig {
    
//     @Bean
//     public UserDetailsService userDetailsService() {
//         return new UserDetailsServiceImpl();
//     }
    
//     @Bean
//     public BCryptPasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
    
//     @Bean
//     public DaoAuthenticationProvider authenticationProvider() {
//         DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//         authProvider.setPasswordEncoder(passwordEncoder());
//         authProvider.setUserDetailsService(userDetailsService());
        
//         return authProvider;
//     }


//     @Bean
// public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//     http
//         .csrf(csrf -> csrf.disable())
//         .authorizeHttpRequests(authorize -> authorize
//             .requestMatchers("/admin/viewEmployee").hasAuthority("ADMIN")
//             .requestMatchers("/admin/deleteEmployee").hasAuthority("ADMIN")
//             .requestMatchers("/admin/employee-datatable").hasAuthority("ADMIN")
//             .anyRequest().authenticated()
//         )
//         .formLogin(form -> form
//             .permitAll()
//             .defaultSuccessUrl("/success", true)
//         )
//         .logout(logout -> logout
//             .permitAll()
//         )
//         .exceptionHandling(exception -> exception
//             .accessDeniedPage("/admin/403")
//         );

//     return http.build();
// }


//     // @Bean
//     // public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//     //     http
//     //         .csrf().disable()
//     //         .authorizeHttpRequests(authorize -> authorize
//     //             .requestMatchers("/admin/viewEmployee").hasAuthority("ADMIN")
//     //             .requestMatchers("/admin/deleteEmployee").hasAuthority("ADMIN")
//     //             .requestMatchers("/admin/employee-datatable").hasAuthority("ADMIN")
//     //             .anyRequest().authenticated()
//     //         )
//     //         .formLogin()
//     //             .permitAll()
//     //             .defaultSuccessUrl("/success", true)
//     //             .and()
//     //         .logout()
//     //             .permitAll()
//     //             .and()
//     //         .exceptionHandling()
//     //             .accessDeniedPage("/admin/403");

//     //     return http.build();
//     // }

//     @Bean
//     public AuthenticationManager authManager(HttpSecurity http) throws Exception {
//         AuthenticationManagerBuilder authenticationManagerBuilder = 
//                 http.getSharedObject(AuthenticationManagerBuilder.class);
//         authenticationManagerBuilder.authenticationProvider(authenticationProvider());
//         return authenticationManagerBuilder.build();
//     }
// }
