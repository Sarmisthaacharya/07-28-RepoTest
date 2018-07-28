package javaProgram;

public class StarPyramid5 {

	public static void main(String[] args) {
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
	
	System.out.println(" ");
	}
	

	}

}
