package set_3.J9_Find_Substring_of_String;

import java.util.Scanner;

public class SubStringofString {

	public static void main(String[] args)
	{
		String string, sub;
		int i,c, length;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the String :");
		
		string = sc.next();
		
		length = string.length();
		
		System.out.println("Substring of\" "+string+ "\" are+ :-");
		
		for(c = 0; c < length; c++)
		{
			for(i = 1; i<=length-c; i++)
			{
				sub = string.substring(c,c+i);
				System.out.println(sub);
			}
		}
		

	}

}
