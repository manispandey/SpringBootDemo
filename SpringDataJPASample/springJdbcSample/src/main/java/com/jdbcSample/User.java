package com.jdbcSample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class User {

	@Setter
	@Getter
	private int id;
	
	@Setter
	@Getter
	private String name,email;
	
}
