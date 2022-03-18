package com.parctise.tryOne.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;



public class MainClass {
	
	static Logger LOG = LoggerFactory.getLogger(MainClass.class);

	public static void main(String[] args) {
		
		ApplicationContext cc1 = SpringApplication.run(MainClass.class, args);
		
		CClass x = cc1.getBean(CClass.class);
		x.dMethod();
		
		ApplicationContext cc2 = SpringApplication.run(MainClass.class, args);

//		DependencyClass y = cc1.getBean(DependencyClass.class);
		
		LOG.info("{}", x.dMethod());
//		LOG.info("{}", cc1);

		LOG.info("{}", cc2);

		
	}

}
