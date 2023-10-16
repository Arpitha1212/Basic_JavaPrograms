package com.kodnest.works;
import java.util.Scanner;
public class TwoDimensionalJaggedArray {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[scan.nextInt()][];
		// logic to create 2D array
		for(int i = 0;i<=arr.length-1;i++) 
		{
		System.out.println("Enter 2D length for 1D "+i);
		arr[i] = new int[scan.nextInt()];
	   }
		for(int i =0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the elements");
				arr[i][j]= scan.nextInt();
			}
		}
		System.out.println("Enter the elements");
		for(int i =0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
		}
	}

}
