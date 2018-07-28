package javaProgram;

public class NumberPyramid4 {

	public static void main(String[] args) {
		
		int k =5;
		int n=1;

		for(int i =0; i<5; i++)
		{
			
			for( int j=0; j<k; j++)
			{
				System.out.print(n +" " );
			}
			k=k-1;
			n=n+1;
			System.out.println();
		}

	}

}
