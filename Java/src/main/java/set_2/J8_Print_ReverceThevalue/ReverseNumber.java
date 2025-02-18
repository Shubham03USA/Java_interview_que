package set_2.J8_Print_ReverceThevalue;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int n;
		int reverce = 0;
		
		System.out.println("Enter the number for reverce :");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		while(n != 0)
		{
			reverce = reverce * 10;
			reverce = reverce + n % 10;
			n = n/10;
		}
		System.out.println("Reverse of entered number is "+reverce);

	}

}
