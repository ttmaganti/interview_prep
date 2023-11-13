package com.magnet.prep.recursion;

import java.util.Arrays;

public class Permutations1toN {
	public static void main(String args[]) {
		int n = 3;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = i + 1;
		}

		generatePermutations(nums, 0);
	}

	static void generatePermutations(int[] input, int index) {
		if (index == input.length - 1) {
			System.out.println(Arrays.toString(input));
			return;
		}

		for (int i = index; i < input.length; i++) {
			swap(input, index, i);
			generatePermutations(input, index+1);
			//backtracks to restore original order after generating permutations for given index
			swap(input, index, i); 
		}
	}
	
	static void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

}
