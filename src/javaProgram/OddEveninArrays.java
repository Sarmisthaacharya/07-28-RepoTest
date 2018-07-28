package javaProgram;

public class OddEveninArrays {

	public static void main(String[] args) {
	
		int a[]= {1, 5,10,6,11,100,45};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i] + " " + "is even Number");
			}
			
			else if(a[i]%2!=0)
			{
				System.out.println(a[i] +" " + "is Odd Number");
			}
			
		}
			

	}

}
