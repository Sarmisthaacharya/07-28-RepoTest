package javaProgram;

public class BreakStatement {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++)
		{			
			if (i==4)
	        {
				break;
	        }
			
	        System.out.println("Value of i is "+i);
		
		}
	System.out.println("Outside loop");
	}
	

}
