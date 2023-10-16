/*2. Write a Java program to solve quadratic equations (use if, else if and else).
	
	Test Data
	Input a: 1
	Input b: 5
	Input c: 1
	Expected Output :
    The roots are -0.20871215252208009 and -4.7912878474779195
    */

package com.W3Resource.BasicPrograms;
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		double result = (b*b)-(4*a*c);
		double res1 = (-b+(Math.pow(result, 0.5)))/(2*a);
		double res2 = (-b-(Math.pow(result, 0.5)))/(2*a);
		System.out.println("The roots are "+res1+"and"+res2);
	}
}
/* Output-Enter the values
1
4
1
The roots are -0.2679491924311228and-3.732050807568877*/