package com.week3.day1;

public class ChangeOddIndex {

	public static void main(String[] args) {
		//initialize and declare variable
		String test = "changeme";
		//convert string to character array
		char[] CharArray = test.toCharArray();
		//iterate through for loop
		for(int i=0;i<CharArray.length;i++) {		
			if(i%2!=0) {
				char test1 = test.charAt(i);
				System.out.print(Character.toUpperCase(test1));
			}
			else {
			System.out.print(test.charAt(i));
		}
		}
		

	}
}
