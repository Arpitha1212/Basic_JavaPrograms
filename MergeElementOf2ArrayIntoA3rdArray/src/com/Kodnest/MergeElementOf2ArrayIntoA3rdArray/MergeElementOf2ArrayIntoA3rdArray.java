package com.Kodnest.MergeElementOf2ArrayIntoA3rdArray;
import java.util.Scanner;

public class MergeElementOf2ArrayIntoA3rdArray
{
	public static void main(String[] args)
	{
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the size of array 1 ");
			int arr1[]= new int [scan.nextInt()];
			System.out.println("Enter the size of array 2 ");
			int arr2[]= new int [scan.nextInt()];
			for(int i =0;i<=arr1.length-1;i++)
			{
				System.out.println("Enter elements of array 1 ");
				arr1[i]=scan.nextInt();
			}
			for(int i =0;i<=arr2.length-1;i++) 
			{
				System.out.println("Enter elements of array 2 ");
				arr2[i]=scan.nextInt();
			}
			int arr3[]=new int [arr1.length+arr2.length];
			int j=0;
			for(int i=0;i<=arr1.length-1;i++) 
			{
				arr3[j]=arr1[i];
				j++;
			}
			for(int i=0;i<=arr1.length-1;i++) 
			{
				arr3[j]=arr2[i];
				j++;
			}
			System.out.print("Array-->1 ");
			for(int i=0;i<=arr1.length-1;i++)
			{
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
			System.out.print("Array-->2 ");
			for(int i=0;i<=arr2.length-1;i++)
			{
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
			System.out.print("Sum of the array elements are ");
			for(int i=0;i<=arr3.length-1;i++) 
			{
				System.out.print(arr3[i]+" | ");
			}
		}
	}
}