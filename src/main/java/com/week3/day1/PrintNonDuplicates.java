package com.week3.day1;

public class PrintNonDuplicates {

	public static void printnonDuplicate(int[] num) {
		for(int i=0;i<num.length;i++) {	
			boolean isduplicate = false;		
			for(int k=0;k<num.length;k++) {
				if(i!=k && num[i]==num[k]) {
					isduplicate =true;
					break;				
			}	
			
		}
			if(!isduplicate) {
				System.out.println(num[i]);}
		}
	}
	
			public static void main(String[] args) {	
				int[] num = {2, 5, 7, 7, 5, 9, 2, 3,9,1};	
				printnonDuplicate(num);

	}

}
