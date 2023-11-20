package com.magnet.prep.core;

import java.util.Arrays;

public class SumOfThreeNumbers {
	
	public static void main(String[] args) {
		int[] input = {-4, -2, 0, 2, 4};
		int targetSum = 6;
		
		System.out.println("Is sum present : "+isSumPresent(input, targetSum));
	}
	
	static boolean isSumPresent(int[] input, int targetSum) {
		if(input == null || input.length < 3) return false;
		Arrays.sort(input);
		
		for(int i=0;i<input.length-2;i++) {
			int current = input[i];
			int low = i+1;
			int high = input.length-1;
			
			while(low < high) {
				if(current + input[low] + input[high] == targetSum) {
					System.out.println("["+current+", "+input[low]+", "+input[high]+"]");
					return true;
				}
				if(current + input[low] + input[high] < targetSum) ++low;
				if(current + input[low] + input[high] > targetSum) --high;
			}
		}
		return false;
	}
}
