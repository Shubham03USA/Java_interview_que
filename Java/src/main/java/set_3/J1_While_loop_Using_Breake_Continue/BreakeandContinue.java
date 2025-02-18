package set_3.J1_While_loop_Using_Breake_Continue;

import java.util.Scanner;

public class BreakeandContinue {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Inpute an integer");
			n = sc.nextInt();
			
			if(n!=0)
			{
				System.out.println("The number is greater than zero ="+n);
			}
			else
			{
				System.out.println("Your number is less than zero");
				break;
			}
		}
		

	}

}
