package com.week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringElements {

	public static void main(String[] args) {
		//declare and initialize input
		String[] strarray = {"HCL", "wipro", "Aspire Systems", "CTS"};
		//store string array in list
		List<String> list = new ArrayList<String>(Arrays.asList(strarray));
		System.out.println(list);
		//arrange the list
		Collections.sort(list);
		//iterate using for loop
		for(int i=list.size()-1;i>=0;i--){
			System.out.println(list.get(i));

		}
		
	}

}
