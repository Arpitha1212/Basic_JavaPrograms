package com.Kodnest.String;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
		String result= convertCase(input);
		System.out.println("Modified string:"+ result);
	}
		public static String convertCase(String input) 
		{
        char arr[]= input.toCharArray();
		for(int i=0;i<=arr.length-1;i++) 
		{
			int temp= arr[i];
			if(temp>=97 && temp<=122)
			{
				temp= temp-32;
			}
			else {
				temp = temp+32;
			}
			arr[i]= (char)temp;
		}
		 input =new String(arr);
		 return input;
	}
}