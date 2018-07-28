package javaProgram;

public class ExceptionHandling1 {

	public static int[] i;
	
	public static void methode()
	{
		i[1] = 0;
	}
	public static void main(String[] args) {

     i = new int[1];

     try
     {
    	 methode();
    	 System.out.println("test");
     }
     catch(ArithmeticException e)
     {
    	 System.out.println("Exception Caught");
     }
     
	}

}
