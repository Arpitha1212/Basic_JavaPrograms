import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int res = RiseToTwo.riseToTwo(num); 
		System.out.println(res); 
	} 
}
