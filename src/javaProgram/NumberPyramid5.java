package javaProgram;

public class NumberPyramid5 {

	public static void main(String[] args) {
		
		int n=5;
		int z=5;
		
		for(int i=1; i<=n; i++)
		{
			for(int j =1; j<i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k =1; k<=z; k++)
			{
				System.out.print(k);
			}
			z--;
			System.out.println();
		}

	}

}
