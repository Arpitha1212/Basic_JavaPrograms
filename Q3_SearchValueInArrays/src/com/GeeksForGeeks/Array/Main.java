package com.GeeksForGeeks.Array;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int arr[] = new int[scan.nextInt()];
	
	for(int i =0;i<=arr.length-1;i++) 
	{
		System.out.println("Enter the elements");
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the number to be find");
	int find = scan.nextInt();
	int count =0;
	for(int i =0;i<=arr.length-1;i++)
	{
		if(find==arr[i])
		{
			System.out.println("The number is present ");
        }
		else 
		{
			count++;
			if(count==arr.length-1) 
			{
				System.out.println("The number is Not present");
			}
		}
	}
 }
}	




	
	
	


