package com.kodnest.String;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		String arr[]= str.split(" ");
		String reverseSentence="";
		for(int i=0;i<=arr.length-1;i++) {
			String word= arr[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseSentence = reverseSentence+reverseWord+" ";
		}
		
	 System.out.println(reverseSentence);
	}
}
