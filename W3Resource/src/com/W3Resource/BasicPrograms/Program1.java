/*1. Write a Java program to get a number from the user and print whether it is positive or negative.

	Test Data
	Input number: 35
	Expected Output :
	Number is positive*/

package com.W3Resource.BasicPrograms;
import java.util.Scanner;
public class Program1
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if(num>0) 
		{
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}

}
	/* Output-Enter a number
	35
	Number is positive*/