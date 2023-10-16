package com.Kodnest.Array;
import java.util.Scanner;
public class BubbleSorting {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]= new int [scan.nextInt()];
		
		for(int i =0;i<=arr.length-1;i++) 
		{
			System.out.println("Enter the elements of an array");
			arr[i]= scan.nextInt();
		}
		System.out.print("Array elements are--->");
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int swap;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					swap = arr[j+1];
					arr[j+1]= arr[j];
					arr[j]=swap;
				}
			}
		}
		System.out.print("Swapped elements are--->");
		for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	}

	}