package com.training.program.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {
	
	
	 
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {

		// Users in memory.

		
		
		  auth.inMemoryAuthentication().withUser("user1").password("12345")
		  .roles("USER");
		  auth.inMemoryAuthentication().withUser("admin1").password("12345")
		  .roles("USER, ADMIN");
		  auth.inMemoryAuthentication().withUser("momin").password("12345")
		  .roles("ADMIN");
		 
		 
		 //////////  Data base authentication(Without Encryption) ////////////////////////////////////////

		
			//auth.userDetailsService(myUserDetailsService);
		
		
		 //////////  Data base authentication(With Encryption) ////////////////////////////////////////
		
		 //For User in database.
		//$2a$12$wbwt2JkwjpZnXr18R8LI3e7ghLbu9vfiy6Z6e4r/WYpCC0FvQ0DFy   // encrypted password
		//12345  //  plain password
		
	// auth.userDetailsService(myUserDetailsService).passwordEncoder(passwordEncoder()) ;
		 
		 

	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	http.csrf().disable();

		// The pages does not require login
		http.authorizeRequests()
				.antMatchers("/","/formLogin", "/logout","viewReportForm")
				.permitAll();

		// /userInfo page requires login as USER or ADMIN.
		// If no login, it will redirect to /login page.
		http.authorizeRequests()
		             .antMatchers("/homePage")
				     .access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");

		// For ADMIN only.
		http.authorizeRequests()
		             .antMatchers("/admin","/newuser")
				     .access("hasRole('ROLE_ADMIN')");
		
		// When the user has logged in as XX.
		// But access a page that requires role YY,
		// AccessDeniedException will throw.
		http.authorizeRequests().and().exceptionHandling()
				.accessDeniedPage("/403");

		
		
		http.authorizeRequests().and()
		.formLogin()
		.loginProcessingUrl("/callSecurityOption")
		.loginPage("/login")		
		.defaultSuccessUrl("/homePage")
		.failureUrl("/failure")
		.usernameParameter("username")
		.passwordParameter("password")
		// Config for Logout Page
		//.and().csrf()
		.and()
		.logout()
		.logoutUrl("/logout")
		.logoutSuccessUrl("/logoutSuccessful");


		    
	}


}
