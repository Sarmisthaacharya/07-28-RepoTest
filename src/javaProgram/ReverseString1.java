package javaProgram;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String s = "HELLO WORLD";
		
		String reverse = "";
		
		int len = s.length();
		for(int i=len-1; i>=0; i--)
		{
			reverse = reverse + s.charAt(i);
		}
		
System.out.println("Reverse String is:" + reverse);


	}

}
