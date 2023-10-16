/* 1. Write a Java program to sum values of an array. */
package com.W3Resource.ArrayPrograms;

import java.util.Scanner;

public class Program01 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter the contents of the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum = sum+arr[i];
		}
		System.out.println("The sum is: "+sum);
	}

}
/*
Output:
10
Enter the contents of the array
1 2 3 4 5 6 7 8 9 10
The sum is: 55
  */
