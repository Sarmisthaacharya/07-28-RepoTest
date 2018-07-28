package javaProgram;

public class ReverseString3 {

	public static void main(String args[]) {
		String str = "Hello World";
		for (String word : str.split(" "))
			reverse(word);
	}

	public static void reverse(String s) {
		for (int idx = s.length() - 1; idx >= 0; idx--)
			System.out.print(s.charAt(idx));
		System.out.print(" ");
	}
}
