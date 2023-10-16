package com.kodnest.works;
import java.util.Scanner;
public class OneDimension {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int arr[]= new int[scan.nextInt()];
	
	for(int i =0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the elements");
		arr[i]= scan.nextInt();
		
	}
	System.out.println();
	for(int i =0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" | ");
	}
   }
}
