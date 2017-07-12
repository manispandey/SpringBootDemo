package com.properties.sample;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:static/templates/application.properties")
public class ApplicationProp {
 /*private int port;

public int getPort() {
	return port;
}

public void setPort(int port) {
	this.port = port;
}*/
}
