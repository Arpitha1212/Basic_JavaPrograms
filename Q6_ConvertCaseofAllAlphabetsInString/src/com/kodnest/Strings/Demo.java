package com.kodnest.Strings;
import java.util.Scanner;
public class Demo {
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	String str= scan.nextLine();
	String result = convert(str);
	System.out.println(result);
}
public static String convert(String str)
{
	char arr[]= str.toCharArray();
	for(int i=0;i<=arr.length-1;i++) 
	{
		int first = arr[0];
	    if(first>=97 && first<=122) 
		     {
		    	 first= first-32;
		    	 arr[0]=(char)first;
		     }
	    
				
		 if(arr[i]==' ') 
		{
			int temp = arr[i+1];
		     if(temp>=97 && temp<=122) 
		     {
		    	 temp = temp-32;
		     }
		     arr[i+1]=(char)temp;
		}
		
		str= new String(arr);
	}
return str;
}
}

