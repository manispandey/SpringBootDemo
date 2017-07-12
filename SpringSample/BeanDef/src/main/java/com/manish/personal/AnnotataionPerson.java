package com.manish.personal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class AnnotataionPerson {
  String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
