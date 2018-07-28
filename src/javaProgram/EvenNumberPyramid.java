package javaProgram;

public class EvenNumberPyramid {

	public static void main(String[] args) {

		int n = 2;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(n + " ");
				n = n + 2;
			}

			
			System.out.println(" ");
		}
		
	}

}
