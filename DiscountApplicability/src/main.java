import java.util.Scanner;
public class main {
	public static void checkDiscount(double PurchaseAmount) {
		if (PurchaseAmount>100) {
			System.out.println("Discount Applicable");
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	double PurchaseAmount = scan.nextDouble();
	checkDiscount(PurchaseAmount);
}
}
