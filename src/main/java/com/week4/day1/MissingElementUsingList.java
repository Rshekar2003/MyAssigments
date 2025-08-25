package com.week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,10,6,8};
		List<Integer> arrlist = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
		arrlist.add(arr[i]);
		}
		System.out.println(arrlist);
		Collections.sort(arrlist);
		System.out.println(arrlist);
		for(int i=0;i<=arrlist.size()-1;i++) {			
			if(arrlist.get(i)+1!=arrlist.get(i+1)) {
				for(int j=arrlist.get(i)+1;j<arrlist.get(i+1);j++) {
				System.out.println(+j);				
			}
		}		
	}
 }

} 
