package com.magnet.prep.core;

public class MaxSubSequenceSum {
	public static void main(String args[]) {
		int[] input = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int result = maxSubsequenceSum(input);
		System.out.println("Max subsequence sum : " + result);
	}

	static int maxSubsequenceSum(int[] input) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		
		for(int num : input) {
			currentSum = Math.max(num, currentSum+num);
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}

}
