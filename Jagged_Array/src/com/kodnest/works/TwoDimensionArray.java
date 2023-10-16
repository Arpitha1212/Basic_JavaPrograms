package com.kodnest.works;
import java.util.Scanner;
public class TwoDimensionArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int arr[][]= new int[scan.nextInt()][scan.nextInt()];
	for(int i =0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the elements");
			arr[i][j]= scan.nextInt();
		}
	}
	System.out.println("Enter the elements");
	for(int i =0;i<=arr.length-1;i++) 
	{
		for(int j=0;j<=arr[i].length-1;j++) 
		{
			System.out.print(arr[i][j]+" | ");
		}
		System.out.println();
	}
}

}
