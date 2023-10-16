package com.kodnest.Strings;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
		char []charArray= input.toCharArray();
		String result = createStringFromCharArray(charArray);
		System.out.println("Created String: "+result);
	}
   public static String createStringFromCharArray(char charArray[])
   {
	   StringBuffer sb = new StringBuffer();
	   for(int i=0;i<= charArray.length-1;i++)
	   {
		   sb.append(charArray[i]);
	   }
      String res= sb.toString();
      return res;
   }
}
