package com.parctise.tryOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	private Sort qs = new QuickSort();
	@Autowired
	private Sort bs = new BubbleSort();
	
	


	public int search(int[] num) {
		System.out.println("Binary search invoked");
		qs.numSort(num);
		return 3;
	}
}
