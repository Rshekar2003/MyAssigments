package com.week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class PrintDuplicates {

	public static void main(String[] args) {	
		//declare & initialize input
		int[] num = {2, 5, 7, 7, 5, 9, 2, 3,9,1};	
		//sort the array
		Arrays.sort(num);
		//for loop to iterate
		for(int i=0;i<num.length-1;i++) {
			//compare the elements with one another
			if(num[i]==num[i+1]) {
				System.out.println(num[i]);
			}
		}

}

	
}	






	