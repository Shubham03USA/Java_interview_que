package J10_If_else_from_scanner;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args)
	{
		int passingMarks, marksOptained;
		
		passingMarks = 40;
		
		System.out.println("Check the conddition from user");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your mark here = ");
		
		marksOptained = sc.nextInt();
		
		System.out.println("MarksOptained is = "+marksOptained);
		
		if(marksOptained >= passingMarks)
		{
			System.out.println("and  Your Passed...");
		}
		else
		{
			System.out.println("Your are failed ...");
		}

	}

}
