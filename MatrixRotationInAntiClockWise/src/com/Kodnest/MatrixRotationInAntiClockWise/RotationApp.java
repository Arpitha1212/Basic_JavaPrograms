package com.Kodnest.MatrixRotationInAntiClockWise;

public class RotationApp {
	public  void rotation(int arr[],int n) 
	{
		for(int count=1;count<=n;count++) 
		{
			int temp=arr[0];
			for(int i=1;i<=arr.length-1;i++) 
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
	}

}
