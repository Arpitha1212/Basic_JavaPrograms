package com.GeeksForGeeks.Array;
import java.util.Scanner;
public class SelectionSorting 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int arr[]= new int[scan.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the contents of the array ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements before sorting ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		SortingApp sortingApp = new SortingApp();
		sortingApp.sort(arr);
		System.out.println();
		System.out.print("Array elements after sorting.....");
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
}
