/*4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise,
	 print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" 
	 if it exceeds 1,000,000.
	Test Data
	Input a number: 25
	Expected Output :
	Input value: 25
	Positive number
	*/

package com.W3Resource.BasicPrograms;
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		float num = scan.nextFloat();
		if(num==0)
		{
			System.out.println("Zero");
		}
		else if( Math.abs(num)<1)
		{
			System.out.println("small");
		}
		else if( Math.abs(num)>1000000)
		{
			System.out.println("large");
		}
		else if(num>0)
		{
			System.out.println("Positive number");
		}
		else if(num<0) 
		{
			System.out.println("Negative number");
		}
		else 
		{
			System.out.println();
		}
	}
}
