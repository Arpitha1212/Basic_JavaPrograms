package com.GeeksForGeeks.Array;
import java.util.Scanner;
public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		int key = scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key) {
				System.out.println(key+" Found at index:"+ i);
			}
		}
		}
		
	}


