package com.week3.day1;

public class CountOccurence {

	public static void main(String[] args) {
		String input = "TestLeaf";
		String inputlc = input.toLowerCase();
		char[] charArray = inputlc.toCharArray();		
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]==1) {
				continue;
			}
			char currentchar = inputlc.charAt(i);
			int count =1;
			for(int j=i+1;j<charArray.length;j++) {
			if(currentchar==inputlc.charAt(j)) {
				count++;
				charArray[j] =1;
		
			}
     }
			System.out.println(currentchar + ":" +count);	
	}
	}
}

