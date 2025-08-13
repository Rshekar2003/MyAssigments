package com.week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Testleaf";
		char[] charArray = str.toCharArray();
		String revstr ="";
		for(int i=charArray.length-1;i>=0;i--){
			 revstr = revstr + str.charAt(i);			
		}
		System.out.println("Reverse string is : "+ revstr);
	}
}
