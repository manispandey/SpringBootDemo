package com.mkyung.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("web.xml");
		HelloWorld hellWorl =  (HelloWorld)appCon.getBean("hellbean");
		hellWorl.callValue();
	}

}
