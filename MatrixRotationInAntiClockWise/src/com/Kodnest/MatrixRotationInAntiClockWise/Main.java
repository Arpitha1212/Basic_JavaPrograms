package com.Kodnest.MatrixRotationInAntiClockWise;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int arr[] = new int[scan.nextInt()];
		
		System.out.println("Enter the contents of the array");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the array elements before rotation");
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		 System.out.println("Enter the number of rotation n");
		 int n=scan.nextInt();
		 RotationApp ra = new RotationApp();
		 ra.rotation(arr, n);
		 
		 System.out.println("Enter the elements after rotation");
		 for(int i=0;i<=arr.length-1;i++) 
			{
			 System.out.print(arr[i]+" ");
			}
				
	}

}
