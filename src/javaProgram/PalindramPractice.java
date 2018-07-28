package javaProgram;

public class PalindramPractice {

	public static void main(String[] args) {
		
		String s = "231";
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
     
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
