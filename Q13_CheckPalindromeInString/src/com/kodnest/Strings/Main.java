package com.kodnest.Strings;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	String nReverse = new StringBuffer(str).reverse().toString();
	if(str.equals(nReverse)) {
		System.out.println("Input "+nReverse+" is palindrome");
	}
	else
	{
		System.out.println("Input "+nReverse+" is not palindrome");

	}
	}
	}
