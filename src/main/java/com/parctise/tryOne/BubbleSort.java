package com.parctise.tryOne;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements Sort {

	@Override
	public int numSort(int[] n ) {
		System.out.println("Bubble sort invoked");
		return 10;
	}
	

}
