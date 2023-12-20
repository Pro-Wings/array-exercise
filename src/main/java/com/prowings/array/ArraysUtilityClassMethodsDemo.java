package com.prowings.array;

import java.util.Arrays;

public class ArraysUtilityClassMethodsDemo {
	
	public static void main(String[] args) {
		
		
		int[] nums = {10,40,20,60,30,50};
		
		sortArray(nums);
		System.out.println("After sorting array : "+ Arrays.toString(nums));
		
		searchElementInArray(nums, 200);
		
		
		
	}

	public static void searchElementInArray(int[] nums, int element) {
		
		int index = Arrays.binarySearch(nums, element);
		
		if(index >= 0)
			System.out.println("Element found in given array at index : "+index);
		else
			System.out.println("Element is not found in given array!!");
		
	}

	public static void sortArray(int[] nums) {
		
		System.out.println("Original Array : "+ Arrays.toString(nums));
		
//		Arrays.sort(nums);
		Arrays.parallelSort(nums);
		
		
	}

}
