package com.Kodnest.LinearSearch;
import java.util.Scanner;
public class Main 
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int arr[] =new int[scan.nextInt()];
	System.out.println("Enter the content of the array ");
	
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the key to search");
	int key = scan.nextInt();
	for(int i=0;i<=arr.length-1;i++) {
		if(key==arr[i]) 
		{
			System.out.println("Key found "+i);
			return;
		}
	}
	System.out.println("key not found");
}
}
