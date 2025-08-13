package com.week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		//declare & initialize input
		String str = "Testleaf";
		//convert string into character array
		char[] charArray = str.toCharArray();
		//declare & initialize empty string
		String revstr ="";
		//use for loop to iterate
		for(int i=charArray.length-1;i>=0;i--){
			 revstr = revstr + str.charAt(i);			
		}
		System.out.println("Reverse string is : "+ revstr);
	}
}
