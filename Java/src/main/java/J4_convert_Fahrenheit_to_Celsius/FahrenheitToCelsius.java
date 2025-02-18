package J4_convert_Fahrenheit_to_Celsius;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args)
	{
		System.out.println("Fahrenheit To Celsius Covertion ");
		
		float temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the tempreture =");
		
		temp = sc.nextFloat();
		
		temp = ((temp - 32) * 5 ) / 9 ;
		
		System.out.println("Temperature is in celsious = "+temp);

	}

}
