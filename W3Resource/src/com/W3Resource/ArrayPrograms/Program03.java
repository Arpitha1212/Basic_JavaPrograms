package com.W3Resource.ArrayPrograms;
public class Program03 
{
	public static void main(String[] args)
	{
		int arr[]= {1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
		System.out.println(key(arr,2013));
		System.out.println(key(arr,2018));
		
	}
	public static boolean key(int arr[],int item) 
	{
		for(int n:arr) 
		{
			if( n==item) 
			{
				return true;
			}
		}
		return false;
	}
}