package com.training.program.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.program.dto.EmployeeDto;
import com.training.program.model.Employee;
import com.training.program.service.CommonService;
import com.training.program.service.EmployeeService;
 ;


@Controller
public class EmployeeController {
	
	
	@Autowired
	CommonService commonService;
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/employeeForm", method = RequestMethod.GET)
	public ModelAndView employeeForm() {

		return new ModelAndView("employeeForm");

	}
	
	
	@RequestMapping(value = "/saveEmployeeData", method = RequestMethod.POST)
	public ModelAndView saveEmployeeInfo(@ModelAttribute("command") EmployeeDto employeeDto, BindingResult result)
			throws Exception {

		/////////////////////////////////////////////////////////////

		/////////////////////////////////////////////////////////////

		String ename = employeeDto.getEmpName();

		 System.out.println(ename);

		Employee employee = new Employee();

		employee.setEmpName(employeeDto.getEmpName());
		employee.setEmpNo(employeeDto.getEmpNo());
		employee.setPosition(employeeDto.getPosition());

		commonService.saveData(employee);

		return new ModelAndView("redirect:/viewEmployees");

	    //return null;

	}
	
	
	@RequestMapping(value = "/viewEmployees", method = RequestMethod.GET)
	public ModelAndView viewAllEmployee() {

		List<Employee> empList = employeeService.getEmployees();

		System.out.println("V" + empList);

		ModelAndView modelAndView = new ModelAndView();

		String message = "Data Passed";

		modelAndView.addObject("empList", empList);

		modelAndView.addObject("message", message);

		modelAndView.setViewName("viewEmployees");

		return modelAndView;

	}


}
