	/*3. Write a Java program that takes three numbers from the user and prints the greatest number.
	
	Test Data
	Input the 1st number: 25
	Input the 2nd number: 78
	Input the 3rd number: 87
	Expected Output :
	The greatest: 87*/

package com.W3Resource.BasicPrograms;
import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1);
		}
		else if(num2>num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
	}
}
