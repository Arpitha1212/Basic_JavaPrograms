package com.Kodnest.MatrixRotationInClockWise;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of the array ");
		int arr[] = new int[scan.nextInt()];
		
		System.out.println("Enter contents of the array ");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elememts before rotation ");
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the number of rotation n");
		int n = scan.nextInt();
		
		for(int count=1;count<=n;count++)
		{
			int temp = arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--) 
			{
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
		System.out.println("Elements after rotation");
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.print(arr[i]+" ");
		}

	}
}
