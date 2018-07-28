package javaProgram;

public class Practice2 {

	public static void main(String[] args) {

		String s1 ="HELLO";
		
		String s2 ="HELLO";
		
		StringBuffer s3 = new StringBuffer("HELLO");
		StringBuffer s4 = new StringBuffer("HELLO");
		
		
		System.out.println(s3.equals(s4));
		
		System.out.println("****************************************");
		
		int number1 = 0;
		int number2 = 1;
		int number3;
		
		int count = 10;
		
		System.out.print(number1 +" "+ number2);
		
		for(int i =2; i<count; i++)
		{
			number3= number1 + number2;
			
			System.out.print(" "+number3);
			
			number1 = number2;
			number2 = number3;
		}
		
	//	System.out.println("***********************************");
		
		int k=8;
		int tim=1;
		
		for(int i=0; i<3; i++){
			for(int j=0; j<k; j++){
			
			System.out.print(" ");
			}	
		
	k = k-4;
	
	for(int j=0; j<tim; j++)
	{
		System.out.print("*" + " ");
	}
	tim = tim + 2;
	}
	

}
}
