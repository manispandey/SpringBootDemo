package com.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
      
	@RequestMapping(value = "/hello2",method =RequestMethod.GET)
	  public String hello1(){  
	        return"Hello! Manish Pandey ,,,,This is ur First Spring Boot Application";  
	    }  
	
	  @RequestMapping(value = "/hello1", method =RequestMethod.POST)  
	    public String hello2(){  
	        return"Hello!";  
	    }  
}
