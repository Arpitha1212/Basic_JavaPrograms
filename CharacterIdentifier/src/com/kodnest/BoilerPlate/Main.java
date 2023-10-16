package com.kodnest.BoilerPlate;
public class Main {
	public static void identifyCharacter(char ch)
	{
		if (Character.isLowerCase(ch))
		{
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') 
			{
				System.out.println("Lower case Vowels");
			}
		else
			{
				System.out.println("Lower case Consonents");
			}
		}
		else if(Character.isUpperCase(ch)) 
		{
				if (ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
				{
					System.out.println("Upper case Vowels");
				}
				else 
				{
					System.out.println("Upper case Consonents");
				}
		}
		else if(Character.isDigit(ch))
				{
					System.out.println("Digit");
				}
			else
			{
				System.out.println("Special character");
			}
		{
	}
	}
	public static void main(String[] args)
	{
	identifyCharacter('a');
	}
	}
	
