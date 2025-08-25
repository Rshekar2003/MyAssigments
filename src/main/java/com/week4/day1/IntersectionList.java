package com.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		//declare & initialize one array in list	
		List<Integer> arrlist1 = new ArrayList<Integer>();
		arrlist1.add(3);
		arrlist1.add(2);
		arrlist1.add(11);
		arrlist1.add(4);
		arrlist1.add(6);
		arrlist1.add(7);
		//get the size of list
		int arr1size = arrlist1.size();
		//declare & initialize one array in list
		List<Integer> arrlist2 = new ArrayList<Integer>();
		arrlist2.add(1);
		arrlist2.add(2);
		arrlist2.add(8);
		arrlist2.add(4);
		arrlist2.add(9);
		arrlist2.add(7);
		//get the size of list
		int arr2size = arrlist2.size();
		//use for loop to iterate
		for(int i = 0;i<arr1size;i++) {
			for(int j=0;j<arr2size;j++) {
				//compare list1 and list
				if(arrlist1.get(i)==arrlist2.get(j)) {
					System.out.println(arrlist1.get(i));
				}
			}
			
		}
		
		
		
	}

}
