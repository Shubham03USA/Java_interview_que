package set_2.J7_whileloop;

import java.util.Scanner;

public class While_loop 
{
    public static void main(String[] args)
    {
    	System.out.println("this is while loop..");
    	
    	int n;
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	
    	while(n != 0) 
    	{
    		System.out.println("You entered " + n);
    		break;
    	}
    	
	
    }
}
