package com.GeeksForGeeks.Arrays;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the arrays ");
		int m = scan.nextInt();
		int n= scan.nextInt();
		int arr1[][] = new int[m][n];
		int arr2[][]=new int[m][n];
		System.out.println("Enter Array 1 Elememts");
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				arr1[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter Array 2 Elememts");
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
			   arr2[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array 1 contents-->");
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=======================================================");
		System.out.println("Array 2 contents-->");
		for(int i=0;i<=arr2.length-1;i++) 
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
      
       int arr3[][]= new int [m][n];
       for(int i=0;i<=arr1.length-1;i++) {
    	   for(int j=0;j<=arr1[i].length-1;j++) 
    	   {
    		   arr3[i][j]= arr1[i][j]+arr2[i][j];
    	   }
       }
       System.out.println("==============================================================");
       System.out.println("Array elements after adding----->");
       for(int i=0;i<=arr1.length-1;i++) {
    	   for(int j=0;j<=arr1[i].length-1;j++) 
    	   {
    		   System.out.print(arr3[i][j]+" ");
    	   }
    	   System.out.println();
	}
	}
}
