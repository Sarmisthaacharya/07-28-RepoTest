package javaProgram;

public class ZeroCountInString {

	public static void main(String[] args) {

		String s = "100011001";
		
		int zero = s.length() - s.replaceAll("[0]","").length();
		
		System.out.println("count of Zeros:" + zero);
		
		
	}

}
