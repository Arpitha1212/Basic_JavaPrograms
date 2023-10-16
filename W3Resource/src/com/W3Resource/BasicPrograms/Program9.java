//Write a Java program that takes a year from the user and prints whether it is a leap year or not.


package com.W3Resource.BasicPrograms;
import java.util.Scanner;
public class Program9
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the year: ");
		int year = scan.nextInt();
		
		if((year%400==0)||(year%4==0)) 
		{
			System.out.println(year+" is leap year");
		}
	}
}

/*-----------------------------------------------------------------------------
Test Data
Input the year: 2016
Expected Output :
2016 is a leap year

Actual Output:
Input the year: 
2016
2016 is leap year*/

 


 