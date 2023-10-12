package com.kodnest.GreatestCommonDivisor;

public class Main {
	public static void findGCD(int a, int b)
	{
		while(b!=0) {
			int rem = a%b;
			a=b;
			b=rem;
		}
		System.out.println("GCD of the number is "+a);
	}
	public static void main(String[] args)
	{
			findGCD(36, 60);
	}
	}


