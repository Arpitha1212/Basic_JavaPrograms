/*6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different*/

package com.W3Resource.BasicPrograms;
import java.util.Scanner;
public class Program6
{
public static void main(String[] args) 
{
Scanner scan = new Scanner(System.in);
float num1 = scan.nextFloat();
float num2 = scan.nextFloat();
if(num1==num2) {
	System.out.println("They are same ");
}
else {
	System.out.println("They are different");
}
}
}
