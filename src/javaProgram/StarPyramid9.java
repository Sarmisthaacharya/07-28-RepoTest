package javaProgram;

public class StarPyramid9 {

	public static void main(String[] args) {
		int k=7;
		int n=5;
		int tim=1;
		
		int a=5;
		int b=3;
		
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
		System.out.println();
		
		for(int i=0; i<4; i++)
		{
			for(int j =0; j<a; j++)
			{
				System.out.print("/ ");
			}
			a=a-2;
		}
	}

}
