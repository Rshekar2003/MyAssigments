package com.week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestnumberList {

	public static void main(String[] args) {
		//declare & initialize an array
		Integer[] intarr = {3,2,11,4,6,7};
		List<Integer> arrlist = new ArrayList<>(Arrays.asList(intarr));
		//get the size of list
		int arrsize = arrlist.size();
		//arrange in ascending using sort
		Collections.sort(arrlist);
		System.out.println(arrlist);
		//use for loop to iterate
		for(int i=arrsize-1;i>0;i--) {
			if(i==arrsize-2) {
			System.out.println(arrlist.get(i));
			
		}

	}
	}
}
