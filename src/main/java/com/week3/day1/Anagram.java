package com.week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//declare & intialize variable
		String input1  = "stops";
		String input2  = "potss";
		
		//check size of the two inputs
		int size1 = input1.length();
		int size2 = input2.length();
		
		//compare the size of two inputs
		if(size1==size2) {			
			System.out.println("The given strings " + input1 + " are Anagram");
		}
		else {
			System.out.println("The given strings " + input1 + " are not Anagram");
		}
				
		//convert two input string to character array
		char[] charArray1 = input1.toCharArray();
		char[] charArray2 = input2.toCharArray();
		
		//sort the two character arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		//compare the sorted arrays
		boolean arrrayequal = Arrays.equals(charArray1, charArray2);		
		if(arrrayequal==true) {
			System.out.println("The given strings " + input2 + " are Anagram");
		}
		else {
			System.out.println("The given strings " + input2 + " are not Anagram");
		}
	
	}

}
