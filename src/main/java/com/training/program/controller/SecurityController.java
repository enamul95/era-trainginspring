package com.training.program.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.program.dto.UserDto;


import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
	
	
	@RequestMapping(value = "/formLogin", method = RequestMethod.GET)
	public ModelAndView employeeForm() {		 
		
		ModelAndView modelAndView=new ModelAndView();	
		
		modelAndView.setViewName("loginPage");

		return  modelAndView;

	}
	
	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
	public String userInfo(			 
			Model model, Principal principal) {

		// After user login successfully.
		String userName = principal.getName();

		System.out.println("User Name: " + userName);
		 

		return ("mainPage");
	}
	
	@RequestMapping(value ="/logoutSuccessful", method = RequestMethod.GET)
	public String logOutPage(Model model) {		 
		
		System.out.println("test");

		return "logout";
	}
	
	@RequestMapping(value = "/failure", method = RequestMethod.GET)
	public String userInfoFail(			 
			Model model, Principal principal) {
 

		return ("loginProblem");
	}


}
