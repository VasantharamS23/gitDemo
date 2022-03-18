package com.parctise.tryOne.basics;

import org.springframework.stereotype.Component;

@Component
public class DependencyClass {
	
	public String depMethod() {
		return 	System.out.println("Dependency method invoked");
;
	}

}
