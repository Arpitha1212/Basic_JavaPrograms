package com.kodnest.Fibonacciseries;

public class Main {
		public static void printFibonacciSeries(int n)
		{
			int sum = 1;
			for(int i = 0;i<=n;i++) 
			{
				sum = sum+i;
				System.out.println(sum);
			}
		}
		public static void main(String[] args)
		{
		printFibonacciSeries(10);
		}
}
