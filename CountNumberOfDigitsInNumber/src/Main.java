import java.util.Scanner;
public class Main {
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = scan.nextInt();
	 CountNumberApp C1 = new  CountNumberApp();
	int res= C1.CountNumber(num);
    System.out.println(res);
}
}
