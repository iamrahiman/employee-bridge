package com.employee.bridge.security.config;
/*
 * package com.apple.employee.bridge.security.config;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import javax.servlet.Filter;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.jaas.memory.
 * InMemoryConfiguration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.web.authentication.www.
 * BasicAuthenticationFilter;
 * 
 * @EnableWebSecurity
 * 
 * @Configuration public class EmployeeBridgeSecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * 
 * // Role based security-admin,user
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * auth.inMemoryAuthentication().withUser("apple1").password("{noop}apple1").
 * roles("USER"); }
 * 
 * // for every request security applied--all api
 * 
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable();
 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
 * }
 * 
 * 
 * // for particular url
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable();
 * http.authorizeRequests().antMatchers("/dashboard/health").hasRole("USER").and
 * ().addFilterBefore((Filter) customFiler(),
 * BasicAuthenticationFilter.class).httpBasic(); }
 * 
 * @Bean public CustomFilter customFiler() { // TODO Auto-generated method stub
 * return new CustomFilter(); }
 * 
 * 
 * 
 * }
 */