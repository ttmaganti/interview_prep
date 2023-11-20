package com.magnet.prep.core;

public class Palindrome {
	
	public static void main(String args[]) {
		String input = "a";
		System.out.println(input +" is a palindrome : "+isPalindrome(input));
	}
	
	static boolean isPalindrome(String input) {
		if(input == null || input.length() == 0) {
			return false;
		}
		
		int left = 0;
		int right = input.length()-1;
		
		while(left < right) {
			if(input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left += 1;
			right -=1;
		}
		
		return true;
	}

}
