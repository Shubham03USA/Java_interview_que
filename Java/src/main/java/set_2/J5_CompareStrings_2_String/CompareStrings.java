package set_2.J5_CompareStrings_2_String;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args)
	{
		String s1, s2;
		
		System.out.println("Enter your s1 string here : ");
		
		Scanner sc = new Scanner(System.in);
		
		s1 = sc.nextLine();
		
		System.out.println("Enter your s2 string here : ");
		
		s2 = sc.nextLine();
		
		 if(s1.compareTo(s2) > 0)
		{
			System.out.println("s1 string is greater");
		}
		 
		 else if(s1.compareTo(s2) < 0)
		{
			System.out.println("s2 is greater string");
			
		}
		else
		{
			System.out.println("Both string are equals");
		}
		

	}

}
