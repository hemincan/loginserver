package com.can.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.can.entity.User;
import com.can.service.UserService;

@Controller
@RequestMapping("/login")
public class testController {

	@Autowired
	private UserService userService;
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		User user=new User();
		user.setAccount("sdsssssssssss");
		userService.save(user);
		ac.getBean("dataSource").toString();
		return userService.findByHQL("from User").toString();
	}
}
