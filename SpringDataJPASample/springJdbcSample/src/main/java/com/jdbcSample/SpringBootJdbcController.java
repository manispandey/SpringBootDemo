package com.jdbcSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
    
	@Autowired
	JdbcTemplate jdbc;  
	
	
	
	@RequestMapping("/insert")
	 public String index(){ 
		String query = "select * from user";
		
	        jdbc.execute("insert into user(name,email)values('manishpersonal','mpandey011@gmail.com')"); 
	        List<Map<String, Object>> map = jdbc.queryForList(query);
	        for (Map row : map) {
	    		User customer = new User();
	    		
	    		System.out.println("User Name::::::"+(String)row.get("NAME"));
	    		
	    	}
	        return"data inserted Successfully";  
	    }  
}
