package J3_Using_Scanner;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args)
	{
		int a;
		float b;
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Integer = ");
		
		a = sc.nextInt();
		
		System.out.println("Your Enterd Intiger value is "+a);
		
		System.out.println("Enter Your floating value = ");
		
		b = sc.nextFloat();
		
		System.out.println("Your Enterd floating value is "+b);
		
        System.out.println("Enter the String = ");

		s = sc.next();
		
		System.out.println("Your Entered String is "+ s);

	}

}
