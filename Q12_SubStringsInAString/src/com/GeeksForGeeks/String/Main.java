package com.GeeksForGeeks.String;

public class Main {
	public static void main(String[] args) {
		String str ="Java";
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length;j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
		}
}
