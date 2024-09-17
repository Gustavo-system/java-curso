package com.cursos.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * NOTA IMPORTANTE:
 * WebSecurityConfigurerAdapter para las versiones actuales de spring ya esta deprecated
 */
@Configuration
@EnableWebSecurity
public class MemorySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // especificamos los tipos de usuarios en memoria y los roles que tendran
        auth.inMemoryAuthentication()
                .withUser("admin").password(encoder().encode("password")).roles("ADMIN")
                .and()
                .withUser("user").password(encoder().encode("password")).roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // especificamos cuales son los recurso que queremos proteger
        http.csrf().disable().authorizeHttpRequests()
                .antMatchers("/api/v1/pruebas-java-persistence/**").hasRole("ADMIN")
                .antMatchers("/api/v1/**").permitAll().anyRequest().authenticated()
                .and().httpBasic();
    }

    @Bean
    public PasswordEncoder encoder() {
        // definimos un metodo para encriptar la password en memoria
        return new BCryptPasswordEncoder();
    }
}
