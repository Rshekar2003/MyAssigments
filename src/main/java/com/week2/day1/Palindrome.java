package com.week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		int	input = 12121;
		int	output = 0;

				for(int i=input;i>0;i=i/10){

					int remainder = i%10;    //remainder = 1
					output = output*10 + remainder; // 0 = 0+1					
				}
					if(input==output)
					{
						System.out.println("The given number is palindrome :" + output);

					}
					else {
						System.out.println("The given number is not palindrome :" + output);
					}
				}
//										

				}
				
	


				


