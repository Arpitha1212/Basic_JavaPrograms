package com.Kodnest.MatrixMultiplication;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n ");
		int n= scan.nextInt();
		int arr1[][] = new int[n][n];
		int arr2[][]= new int[n][n];
		System.out.println("Enter the elements of matrix 1  ");
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=0;j<=arr1[i].length-1;j++) 
			{
				arr1[i][j]= scan.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix 2 ");
		for(int i=0;i<=arr2.length-1;i++) 
		{
			for(int j=0;j<=arr2[i].length-1;j++) 
			{
				arr2[i][j]= scan.nextInt();
			}
		}
		System.out.println("Matrix 1 contents are---->");
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=0;j<=arr1[i].length-1;j++) 
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2 contents are---->");
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=0;j<=arr1[i].length-1;j++) 
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		int arr3[][]= new int[n][n];
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=0;j<=arr1[i].length-1;j++) 
			{
				for(int k=0;k<=arr1[i].length-1;k++) 
				{
					arr3[i][j] = arr3[i][j]+arr1[k][i]*arr2[j][k];
				}
			}
		}
		System.out.println("Matrix elements after multiplying : ");
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=0;j<=arr1[i].length-1;j++) 
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
