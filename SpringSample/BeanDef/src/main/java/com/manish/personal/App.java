package com.manish.personal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
     ApplicationContext app = new ClassPathXmlApplicationContext("customer.xml");
     CustomerService custSer = (CustomerService)app.getBean("custombean");
     custSer.setMessage("Manish Is Chutiya");
     System.out.println("Message : " + custSer.getMessage());
     CustomerService custSerA = (CustomerService)app.getBean("custombean");
     custSerA.setMessage("chandaan is cool guy but bhosdiwaala");
     System.out.println("Message : " + custSerA.getMessage());
	}

}
