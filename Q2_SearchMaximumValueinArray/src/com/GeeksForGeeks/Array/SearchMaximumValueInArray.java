package com.GeeksForGeeks.Array;
import java.util.Scanner;
public class SearchMaximumValueInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int num = scan.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the elements");
			arr[i]=scan.nextInt();
		}
		int compare = arr[0];
		for(int i=0;i<=arr.length-1;i++) 
		{
			if(arr[i]>=compare)
			{
				compare=arr[i];
		}
		}
		System.out.print("Maximum value is "+compare);
		}
	}


