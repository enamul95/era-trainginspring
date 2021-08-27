package com.training.program.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.training.program.dto.ParameterDto;
import com.training.program.model.EmployeeStaticData;
import com.training.program.service.CommonService;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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


}
