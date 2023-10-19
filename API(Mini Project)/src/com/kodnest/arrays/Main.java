package com.kodnest.arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the contents of the array");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Press 1 for Searching");
		System.out.println("Press 2 for Sorting");
		System.out.println("Press 3 for Finding Maximum and Minimun value ");
		System.out.println("Press any other for TATA BYE BYE.........");

		int choice = scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Press 1 for linear Search");
		       System.out.println("Press 2 for Binary Search");
		       int choice1= scan.nextInt();
		       if(choice1==1) 
		       {
		    	   System.out.println("Enter a key to search ");
		    	   int key = scan.nextInt();
		    	   KodNestSearchSort kss=new KodNestSearchSort();
		    	   int res = kss.linearSearch(arr,key);
		    	   if(res>=0) 
		    	   {
		    		   System.out.println("Key found ");
		    	   }
		    	   else 
		    	   {
		    		   System.out.println("Key not found");
		    	   }
		       }
		       else if(choice1==2)
		       {
		    	   System.out.println("Enter a key to search ");
		    	   int key = scan.nextInt();
		    	   KodNestSearchSort kss=new KodNestSearchSort();
		    	   int res = kss.linearSearch(arr,key);
		    	   if(res>=0) 
		    	   {
		    		   System.out.println("Key found ");
		    	   }
		    	   else 
		    	   {
		    		   System.out.println("Key not found");
		    	   }
		       }
		       
		  case 2:System.out.println("Press 1 for bubble sorting");
		       System.out.println("Press 2 for selection sorting");
		       System.out.println("Press 3 for insertion sorting");
		       
		       int choice2= scan.nextInt();
		       if(choice2==1) 
		       {
		    	  System.out.println("Press 1 for bubble sorting in ascending order");
		    	  System.out.println("Press 2 for bubble sorting in descending order");
		    	  int choicesort1 =scan.nextInt();
		    	  if(choicesort1==1) 
		    	  {
		    		  KodNestSearchSort kss=new KodNestSearchSort();
		    	 	    kss.bubbleSortAscending(arr);
		    	 	    
		    	 	    System.out.println("Sorted array elements in ascending order------>");
		    				for(int i=0;i<=arr.length-1;i++) 
		    				{
		    					System.out.print(arr[i]+" ");
		    				}
		    	  }
		    	  else if(choicesort1==2) 
		    	  {
		    		  KodNestSearchSort kss=new KodNestSearchSort();
		    	 	    kss.bubbleSortDescending(arr);
		    	 	    
		    	 	    System.out.println("Sorted array elements in descending order------>");
		    				for(int i=0;i<=arr.length-1;i++) 
		    				{
		    					System.out.print(arr[i]+" ");
		    				}
		    	    }
		       }
		    	  if(choice2==2) 
		    	  {
		    		  System.out.println("Press 1 for selection sorting in ascending order");
			    	  System.out.println("Press 2 for selection sorting in descending order");
			    	  int choicesort2 =scan.nextInt();
			    	  if(choicesort2==1) 
			    	  {
			    		  KodNestSearchSort kss=new KodNestSearchSort();
			    	 	   kss.selectionSortAscending(arr);	
			    	 	   System.out.println("Sorted array elements in ascending order------>");
			    				for(int i=0;i<=arr.length-1;i++) 
			    				{
			    					System.out.print(arr[i]+" ");
			    				}
			    	  }
			    	  else if(choicesort2==2)
			    	  {
			    		  KodNestSearchSort kss=new KodNestSearchSort();
			    	 	   kss.selectionSortDescending(arr);	
			    	 	   System.out.println("Sorted array elements in descending order------>");
			    				for(int i=0;i<=arr.length-1;i++) 
			    				{
			    					System.out.print(arr[i]+" ");
			    				}
			    	  }
		    	  }
			    	  if(choice2==3) 
			    	  {
			    		  System.out.println("Press 1 for insertion sorting in ascending order");
				    	  System.out.println("Press 2 for insertion sorting in descending order");
				    	  int choicesort3=scan.nextInt();
				    	  if(choicesort3==1) 
				    	  {
				    		  KodNestSearchSort kss=new KodNestSearchSort();
				    		  kss.insertionSortAscending(arr);
				    		  System.out.println("Sorted array elements in ascending order------>");
			    				for(int i=0;i<=arr.length-1;i++) 
			    				{
			    					System.out.print(arr[i]+" ");
			    				}
				    	  }
				    	  else if(choicesort3==2) 
				    	  {
				    		  KodNestSearchSort kss=new KodNestSearchSort();
				    		  kss.insertionSortDescending(arr);
				    		  System.out.println("Sorted array elements in descending order------>");
			    				for(int i=0;i<=arr.length-1;i++) 
			    				{
			    					System.out.print(arr[i]+" ");
			    				}
				    	  }
			    	  }
			    	  
		  case 3:System.out.println("Press 1 for maximum value finding");
		         System.out.println("Press 2 for minimum value finding");
			     int choice3= scan.nextInt();
		         if(choice3==1) 
			    	  {
		             	 KodNestSearchSort kss=new KodNestSearchSort();
		        	    int res= kss.findMax(arr);
		        	    System.out.println("Maximum value : "+res);
			    	  }
		               else if(choice3==2) 
		              {
		        	 KodNestSearchSort kss=new KodNestSearchSort();
		        	 int res = kss.findMinimum(arr);
		        	 System.out.println("Minimum value : "+res);
		         }
		         break;
		         default:
		        	 System.out.println("TATA BYE BYE................");
		     }
		   }
		}