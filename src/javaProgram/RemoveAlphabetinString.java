package javaProgram;

public class RemoveAlphabetinString {

	public static void main(String[] args) {
		
		String s ="ABC123ghb678";
		
		s = s.replaceAll("[A-Za-z]", "");
		
		System.out.println(s);

	}

}
