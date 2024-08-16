package com.Bao.StigManager.Security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager createConfiguration() {
        UserDetails userDetails1 = createNewUserDetails("Bao", "Password");

        return new InMemoryUserDetailsManager(userDetails1);
    }

    private UserDetails createNewUserDetails(String username, String password) {
        Function<String, String> passwordEncoder
            = input -> passwordEncoder().encode(input);

            UserDetails userDetails = User.builder()
                .passwordEncoder(passwordEncoder)
                .username(username)
                .password(password)
                .roles("USER","ADMIN")
                .build();
            
            return userDetails;
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    // Spring security configuration to work with h2-console
    @Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated()
		);
		http.formLogin(Customizer.withDefaults());
		http.csrf(csrf -> csrf.disable());
		http.headers(header -> header.frameOptions(frameOptions -> frameOptions.disable()));
	 
		return http.build();
	}
}
