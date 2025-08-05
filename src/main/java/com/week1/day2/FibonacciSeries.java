package com.week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		//to generate a fibonacci series
		int firstnum=0;
		int secondnum=1;
		int thirdnum;
		
		for(int i =0;i<=8;i++) {			
			System.out.println(firstnum);
			thirdnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = thirdnum;
			
		}
		
	}

}
