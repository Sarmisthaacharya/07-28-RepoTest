package javaProgram;

public class StarPyramid8 {

	public static void main(String[] args) {
		
		int k=7;
		int n=5;
		int tim=1;
		
		for(int i=0;i<5; i++)
		{
			for(int j =0; j<k; j++)
			{
				System.out.print(" ");
			}
			k=k-2;
			
			for(int j=0; j<tim; j++)
			{
				System.out.print("* ");
			}
			
		tim = tim+2;
		
		for(int j=0; j<n; j++)
		{
			System.out.print(" ");
		}
			n=n-2;
			
			System.out.println();
			
			
			
			
		}

	}

}
