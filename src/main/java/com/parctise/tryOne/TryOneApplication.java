package com.parctise.tryOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TryOneApplication {

	public static void main(String[] args) {
		
//		BinarySearch b = new BinarySearch(new BubbleSort());
		
		ApplicationContext app = SpringApplication.run(TryOneApplication.class, args);
		BinarySearch b= app.getBean(BinarySearch.class);
		
		int result = b.search(new int[] {1, 3, 6, 2, 1});
		System.out.println(result);

	}

}
