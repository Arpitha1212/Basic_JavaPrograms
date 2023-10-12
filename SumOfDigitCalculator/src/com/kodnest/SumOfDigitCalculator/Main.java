
package com.kodnest.SumOfDigitCalculator;

import java.util.Scanner;

public class Main 
{
public static void calculateSumOfDigits(int n) 
{
 int sum = 0;
	while(n>0) 
	{
		int lastDigit= n%10;
		sum=lastDigit+sum;
		n= n/10;
	} 
	System.out.println(sum);
}
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number") ;  
int n = scan.nextInt();
calculateSumOfDigits(n);
}
}
