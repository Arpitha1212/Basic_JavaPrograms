/*7. Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
*/


package com.W3Resource.BasicPrograms;
import java.util.Scanner;
public class Program7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int months = scan.nextInt();
		int year = scan.nextInt();
		
		switch(months) {
		case 1:System.out.println("January has 31");
		break;
		case 2:
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
		{
			System.out.println("February "+year+" has "+29+" days");
		}
		else {
			System.out.println("February "+year+" has "+28+" days");
		}
		break;
		case 3 :System.out.println("march has 31");
		break;
		case 4:System.out.println("April has 30");
		break;
		case 5:System.out.println("May has 31");
		break;
		case 6:System.out.println("june has 30");
		break;
		case 7:System.out.println("july has 31");
		break;
		case 8:System.out.println("august has 31");
		break;
		case 9:System.out.println("September has 30");
		break;
		case 10:System.out.println("October has 31");
		break;
		case 11:System.out.println("November has 30");
		break;
		case 12:System.out.println("December has 31");
		break;
		}
	}
}
