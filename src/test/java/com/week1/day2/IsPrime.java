package com.week1.day2;

public class IsPrime {

		public static void main(String[] args) {
			
			int num = 0;
			boolean flag = false;
			
			if(num<=0||num==1) {
				flag = true;
			}
			
			for(int i=2;i<=num/2;i++) 
			{
				if(num%i==0) {
					flag = true;
					break;
		
			}		
		}
			if(!flag) {
				System.out.println("The given number is  prime number : " + num);
				
			}
			else {
				System.out.println("The given number is not prime number : " + num);
			}

		}
		}
