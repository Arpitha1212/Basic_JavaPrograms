package com.arrays.level2;

import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the elements ");
			arr[i] = scan.nextInt();
		}
		
		for(int i =0;i<=arr.length-1;i++) {
			if(arr[i]%5==0) {
				System.out.println("numbers are "+arr[i]);
			}
		}
		
		
	}


}
