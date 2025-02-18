package set_3.J4_Print_Multipliction_Table;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args)
	{
		int n,c;
		
		System.out.println("Enter the number for its table = ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		System.out.println("The table of "+n+" is = ");
		
		for(c=1;c<=10;c++)
		{
			System.out.println(n+" * "+c+" = "+(n*c));
		}
		
		
		

	}

}
