package set_3.J10_Reverce_the_String;

import java.util.Scanner;

public class ReverceString {

	public static void main(String[] args) 
	{
		//case 1
		
		String original, reverse = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		
		original = sc.nextLine();
		
		int length = original.length();
		
		for(int i= length-1;i >= 0; i--)
		{
			reverse = reverse + original.charAt(i);
			System.out.println("Reverse of entered string is ="+reverse);
			
		}
		
		
		
		/*
		 * //case 2
		 * 
		 * StringBuffer a = new StringBuffer("Java program is fun");
		 * 
		 * System.out.println(a.reverse());
		 */
		

	}

}
