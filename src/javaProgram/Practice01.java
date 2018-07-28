package javaProgram;

public class Practice01 {

	public static void main(String[] args) {

		String rev= "";
		String s1 ="hello world";
		
		System.out.println(s1.length());
		for(int i=s1.length()-1; i>=0; i--)
		{
		rev = rev + s1.charAt(i);
		}
	
		System.out.println(rev);
	}

}
