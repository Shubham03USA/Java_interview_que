package set_4.Number_is_palindrome_or_Not;

import java.util.Scanner;

public class PalindromOrNot {

	public static void main(String[] args) 
	{
		int n,c,r;
		int s=0;
		
		System.out.println("Enter the NUmber to check for palindrom: ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		c=n;
		
		while(n>0)
		{
			r = n%10;
			s = (s*10)+r;
			n = n/10;
		}
		if(c==s)
		{
			System.out.println("The number is palindrom");
			
		}
		else
		{
			System.out.println("The number is not palindrom");
		}
		
		
		
		
		
		/*
		 * Case 2
		 * 
		 * String original, reverse = "";
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the string :");
		 * 
		 * original = sc.nextLine();
		 * 
		 * int length = original.length();
		 * 
		 * for(int i= length-1; i>=0; i--) { reverse = reverse + original.charAt(i);
		 * 
		 * if(original.equals(reverse)) {
		 * System.out.println("Entered string is palindrom..."); } else {
		 * System.out.println("Enterd string is not palindrom"); }
		 * 
		 * } 
		 */	
		
	}

}
