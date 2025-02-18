package set_3.j7_Check_no_is_Armstrong_or_not;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
      int n,c;
      int rem;
      int arm = 0;
      System.out.println("Enter any number :");
      
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      c = n;
      while(n>0)
      {
    	  rem = n%10;
    	  arm = (rem*rem*rem) + arm;
    	  n= n/10;
    	  
      }
      if(c==arm)
      {
    	  System.out.println("Armstrong Number");
      }
      else 
      {
    	 System.out.println("Number is not Armstrong"); 
		
	  }
	}

}
