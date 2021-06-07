package by.testingSystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    private CustomSuccessHandler customSuccessHandler;

    @Autowired
    public void setCustomSuccessHandler(CustomSuccessHandler customSuccessHandler) {
        this.customSuccessHandler = customSuccessHandler;
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/").permitAll()
//                    .antMatchers("/user").access("hasRole('ROLE_USER')")
//                .antMatchers("/resources/**").permitAll()
                    .anyRequest().authenticated();
        http
            .formLogin()
                .loginPage("/login")
                .successHandler(customSuccessHandler)
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder)
                .usersByUsernameQuery("select login, password, role_roleId from user where login=?")
                .authoritiesByUsernameQuery("select login, role from user join role on user.role_roleId=role.roleId where login=?");
    }
}
