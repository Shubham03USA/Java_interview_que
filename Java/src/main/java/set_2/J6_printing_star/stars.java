package set_2.J6_printing_star;

public class stars {

	public static void main(String[] args)
	{
	    int row, numberofStar;
	    
	    System.out.println("Enter number :");
	    
	   
	    
	    for(row = 1; row <= 10; row++)
	    {
	    	for(numberofStar = 1; numberofStar <= row; numberofStar++)
	    	{
	    		System.out.println(" *");
	    	}
	    	System.out.println();
	    }

	}

}
