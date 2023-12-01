package com.magnet.prep.core;

import java.util.*;
public class SortColors {
	
	public static void main(String args[]) {
		int[][] inputs = {
				{0,1,0},
				{1,1,0,2},
				{2,1,1,0,0},
				{2,2,2,0,1,0},
				{2,1,1,0,1,0,2}
		};
		
		for(int i=0;i<inputs.length;i++) {
			int[] sortedColors = sortColors(inputs[i].clone());
			System.out.println(Arrays.toString(sortedColors));
		}
	}
	
	private static int[] sortColors(int[] colors) {
		int red = 0;
		int white = 0;
		int blue = colors.length - 1;
		
		while(white <= blue) {
			if(colors[white] == 0) {
				if(colors[red] != 0) {
					swap(colors, red, white);
				}
				red++;
				white++;
			} else if(colors[white] == 1) {
				white++;
			} else if(colors[white] == 2) {
				if(colors[blue] != 2) {
					swap(colors, white, blue);
				}
				blue--;
			}
		}
		return colors;
	}
	
	private static void swap(int[] colors, int x, int y) {
		int temp = colors[x];
		colors[x] = colors[y];
		colors[y] = temp;
	}

}
