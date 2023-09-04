package com.pamidi.security;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
public class SecurityUtils {

//	@Bean
//	BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Bean
//	UserDetailsService service() {
//		InMemoryUserDetailsManager udm = new InMemoryUserDetailsManager();
//		UserDetails user = User.withUsername("mpamidi").password(passwordEncoder().encode("mpamidi")).authorities("read").build();
//		udm.createUser(user);
//		return udm;
//	}
//	
//	@SuppressWarnings("removal")
//	@Bean
//	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		http.httpBasic();
//		http.authorizeHttpRequests().anyRequest().authenticated();
//		http.csrf().disable();
//		return http.build();
//	}
}
