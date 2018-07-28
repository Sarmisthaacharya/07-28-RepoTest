package javaProgram;

public class VowelCount {

	public static void main(String[] args) {
		
		String s = "BCD";
		vowelInString(s);

	}
	
	
	public static void vowelInString(String str)
	{
		int count = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' ||str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				count++;
			}
		}
		
		System.out.println("Number of Vowels in String:" + count);
		
	}

}
