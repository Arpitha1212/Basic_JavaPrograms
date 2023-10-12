import java.util.Scanner;
public class TheCalculatorDilemma {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two numbers ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Enter an Operator ");
		String operator = scan.next();
		switch (operator)
		{
		    case "+":
			System.out.println("Result of addition is "+(num1+num2));
			break;
			case "-" :
			System.out.println("Result of substraction is "+(num1-num2));
			break;
			case "*" :
			System.out.println("Result of multiplication is "+(num1*num2));
			break;
			case  "/":
			System.out.println("Result of addition is "+(num1/num2));
			break;
		
		}
	}
}