package com.arrays.level2;
import java.util.Scanner;
public class OddNumber 
{
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
			if(arr[i]%2!=0) {
				System.out.println("odd numbers are "+arr[i]);
			}
		}
		
		
	}

}
