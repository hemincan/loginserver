package com.can.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		return ac.getBean("dataSource").toString();
	}
}
