package com.week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		
		//declare & intialize two variable input
		int[] a = {3,2,11,4,6,7}; 
		int[] b = {1,2,8,4,9,7};
		
		//use for loop to iterate
		for (int i =0;i<a.length;i++) {
			//use nested for loop to iterate
			for(int j=0;j<b.length;j++) {			
			//compare both arrays	
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
