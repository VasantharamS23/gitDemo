package com.parctise.tryOne.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CClass {
	
	@Autowired
	private DependencyClass dc;
	
	public Object[] dMethod() {
		System.out.println("component method invoked");
		
		return dc.depMethod();;
	}

}
