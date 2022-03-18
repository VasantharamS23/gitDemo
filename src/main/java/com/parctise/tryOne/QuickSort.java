package com.parctise.tryOne;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class QuickSort implements Sort {

	@Override
	public int numSort(int[] num) {
		System.out.println("Quick sort invoked");
		return 99;
	}

}
