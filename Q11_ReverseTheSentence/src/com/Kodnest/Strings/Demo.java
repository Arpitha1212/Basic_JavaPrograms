package com.Kodnest.Strings;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	   String str= scan.nextLine();
	   String arr1[]=str.split(" ");
	   String arr2[]=new String[arr1.length];
	   StringBuffer fs = new StringBuffer();
	   
	   int j=0;
	   for(int i=arr1.length-1;i>=0;i--) {
		   arr2[j]=arr1[i];
		   fs.append(arr2[j]+" ");
		   j++;
	   }
	   System.out.println(fs.toString());
	}
	
}