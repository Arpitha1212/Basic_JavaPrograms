package com.kodnest.works;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the chocolate ");
		String name = scan.next();
		ChocolateName(name);
	    
	}
	public static void ChocolateName(String name) 
	{
		if(name=="MANGO")
		{
			System.out.println("You can buy kofy and choky choclate or you can buy kitkat cholcate");
		}
		else if(name=="KOFY") 
		{
			System.out.println("You can buy Choky and Mango.");
		}
		else if(name =="CHOKY") 
		{
			System.out.println("YOU CAN BUY MANGO AND CHOKY...");
		}
		else {
			System.out.println("No  We don't have that chocolate in our shop");
		}
		
	}
	
}