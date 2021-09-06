package com.training.program.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.training.program.dto.ParameterDto;
import com.training.program.dto.UserDto;
import com.training.program.model.EmployeeStaticData;
import com.training.program.model.LoginUser;
import com.training.program.model.LoginUserInfo;
import com.training.program.model.LoginUserRole;
import com.training.program.service.CommonService;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("message", "Welcome to Spring MVC");

        modelAndView.setViewName("index");

        return modelAndView;
    }

    @RequestMapping(value = "/formRegistration", method = RequestMethod.GET)
    public ModelAndView employeeForm() {


        List<EmployeeStaticData> deptList = commonService.getAllDept();

        ModelAndView modelAndView=new ModelAndView();

        modelAndView.addObject("deptList", deptList);

        //System.out.println(deptList);


        modelAndView.setViewName("userRegForm");


        return  modelAndView;

    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/selectDesignationList", method = RequestMethod.POST)
    @ResponseBody
    public String listItem(@RequestBody String cData) throws Exception {


        System.out.println("dept : " + cData);

        Map<String, String> model = new HashMap<>();

        Gson gson = new GsonBuilder().create();
        // Boolean isJson = commonService.isJSONValid(cData);
        String toJson = "";

        ParameterDto parameterDto = gson.fromJson(cData, ParameterDto.class);

        System.out.println("dept : " + parameterDto.getDeptName());

        ObjectWriter ow = new ObjectMapper().writer()
                .withDefaultPrettyPrinter();

        List<EmployeeStaticData> designationList = (List<EmployeeStaticData>) (Object) commonService.getDesignation(parameterDto);

        //System.out.println(designationList);

        toJson = ow.writeValueAsString(designationList);

        System.out.println(toJson);

        // @RequestBody String cData

        //System.out.println(cData);

        //System.out.println("test");

        return toJson;

    }


    @RequestMapping(value = "/employeeDataSave", method = RequestMethod.POST)
    public ModelAndView saveCommitteeInfo(@ModelAttribute("userDto") @Validated
                                                      UserDto userDto , BindingResult result)
            throws Exception {





        System.out.print( userDto.getEmpLastName() );

        System.out.print( userDto.getEmpJoiningDate() );


        System.out.print( userDto.getEmployeeDept() );

        System.out.print( userDto.getEmployeeDesig());

        LoginUser loginUser=new LoginUser();

        loginUser.setEnabled(1);
        loginUser.setUsername(userDto .getEmpID() );

        //loginUser.setPassword(userDto.getEmpPassword());

        // encode text using BCCrypt Encoding System
        // inport import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String password = passwordEncoder.encode(userDto.getEmpPassword() );

        loginUser.setPassword(password);


        commonService.saveData(loginUser);


        LoginUserRole loginUserRole=new LoginUserRole();

        loginUserRole.setUsername(userDto.getEmpID() );
        loginUserRole.setUserRole(userDto.getRole());

        commonService.saveData(loginUserRole);

        LoginUserInfo loginUserInfo=new LoginUserInfo();

        loginUserInfo.setUsername(userDto.getEmpID());
        loginUserInfo.setFirstName(userDto.getEmpFirstName());
        loginUserInfo.setLastName(userDto.getEmpLastName());
        loginUserInfo.setEmployeeDept(userDto.getEmployeeDept());
        loginUserInfo.setEmployeeDesig(userDto.getEmployeeDesig());
        loginUserInfo.setBirthDate(userDto.getEmpBirthDate());
        loginUserInfo.setJoiningDate(userDto.getEmpJoiningDate());

        commonService.saveData(loginUserInfo);


        ModelAndView modelAndView=new ModelAndView();

        modelAndView.setViewName("index");

        return modelAndView;

    }


}
