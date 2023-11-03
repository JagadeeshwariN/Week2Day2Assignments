package week2.day2.assignments;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {

		int num[]= {22,23,25,26}; 
		 
		System.out.println("Array Length : " + num.length);
		Arrays.sort(num);
		
		for (int i = 0; i < num.length-1; i++) 
		{
//			System.out.println(num[i]);
			
			if (num[i+1]- num[i] != 1)
			{
					System.out.println("Missing Number in the given array is :  " + (num[i]+1) );
			}	
		}
		
	}
	

}
