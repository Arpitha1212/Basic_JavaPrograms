import java.util.Scanner;
public class Main {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = scan.nextInt();
		System.out.println("Enter the power value");
		int num2 = scan.nextInt();
		 PowerN P1 = new  PowerN();
		int res= P1.powern(num1,num2);
		 System.out.println(res);
	}

}
