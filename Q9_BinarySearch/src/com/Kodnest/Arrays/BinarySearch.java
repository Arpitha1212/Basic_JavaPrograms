package com.Kodnest.Arrays;
import java .util.Scanner;
public class BinarySearch {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arr[] = new int[scan.nextInt()];
		
		for(int i =0;i<=arr.length-1;i++) 
		{
			System.out.println("Enter the elements of the array");
			arr[i]= scan.nextInt();
		}
		System.out.println("Enter the key to search ");
		int key = scan.nextInt();
		SearchApp searchApp = new SearchApp();
		int res =searchApp.BinarySearch(arr,key) ;
		if(res>=0) 
		{
			System.out.println("Key found "+res);
		}
		else {
			System.out.println("key not found ");
		}
   }
}
