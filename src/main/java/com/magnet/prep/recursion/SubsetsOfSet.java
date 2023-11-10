package com.magnet.prep.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfSet {

	public static void main(String args[]) {
		int[] input = {1, 2, 3};
		printSubsets(input);
	}
	
	private static void printSubsets(int[] input) {
		printSubsets(input, new ArrayList<>(), 0);
	}
	
	private static void printSubsets(int[] input, List<Integer> currentSet, int index) {
		
		if(index == input.length) {
			System.out.println(currentSet);
			return;
		}
		
		currentSet.add(input[index]);
		printSubsets(input, currentSet, index+1);
		
		currentSet.remove(currentSet.size()-1);
		printSubsets(input, currentSet, index+1);
	}
}
