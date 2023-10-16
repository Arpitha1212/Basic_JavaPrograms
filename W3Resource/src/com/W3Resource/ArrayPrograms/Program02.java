//2.Write a Java program to calculate the average value of array elements.
package com.W3Resource.ArrayPrograms;

public class Program02 
{
public static void main(String[] args) 
{
	int arr[]= {20, 30, 25, 35, -16, 60, -100};
	int sum =0;
	 for(int i=0;i<=arr.length-1;i++ ) {
		 sum= sum+arr[i];
	 }
	 double average = sum/arr.length;
	System.out.println("Average value of the array elements is :"+ average);
}
}
/*OutPut:
Sample Output:
Average value of the array elements is : 7.0 

Actual Output:
Average value of the array elements is :7.0

*/