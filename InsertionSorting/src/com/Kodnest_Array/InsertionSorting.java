package com.Kodnest_Array;
import java.util.Scanner;
public class InsertionSorting 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of the elements ");
		int arr[]= new int[scan.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the array contents ");
			arr[i]= scan.nextInt();
		}
		System.out.print("Array elements before sorting ");
		for(int i =0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
					
		}
		SortingApp Sort=new SortingApp();
		Sort.sort(arr);
		  
		 System.out.println();
		 System.out.print("Array elements after sorting ");
			for(int i =0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
		
	}

}
