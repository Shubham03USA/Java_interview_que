package set_2.J1_Nested_if;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args)
	{
		int marksOptained;
		int passingMarks = 40;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inpute your scored marks : ");
		
		marksOptained = sc.nextInt();
		
		if(marksOptained >= passingMarks)
		{
			if(marksOptained > 75)
			{
				System.out.println("you get Grade A+ with Distingtion");
			}
			else if(marksOptained > 60) 
			{
				System.out.println("you get Grade A ");
				
			}
			else if(marksOptained > 50)
			{
				System.out.println("You get Grade B");
			}
			else if(marksOptained > 40 )
			{
				System.out.println("You get Grade c");
			}
			else
			{
				System.out.println("better luck for next time");
			}
			
		}
		else
		{
		   System.out.println("You failed the exam");	
		}
		

	}

}
