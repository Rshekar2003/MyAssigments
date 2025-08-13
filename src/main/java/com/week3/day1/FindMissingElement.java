package com.week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		//initialize & declare input
		int[] input = {1, 5,4,2,8, 6, 7};
		int output = 3;
		//sort the array input 1245679
		Arrays.sort(input); 		
		for(int i=0;i<input.length;i++) {
			//compare 1st index with 2nd value
				if(input[i]!=input[i+1]-1) {
				int	output1 = input[i] + 1;
				System.out.println(output1);	
					break;
				}			
				
			}
		
		}

	

}
