import java.util.Scanner;
public class TemperatureConverterApp
{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter temperature from Fahrenheit to Celsius");
	double F= scan.nextDouble();
	TheTemperatureConverter temperatureConverter = new TheTemperatureConverter();
	double celsius = temperatureConverter.convertFahrenheitToCelsius(F);
	System.out.println(celsius);
}
}