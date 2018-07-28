package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		
		String s1 = "Sarmistha";
		System.out.println(removeDuplicates(s1));
			
		
	}

	public static String removeDuplicates(String s1)
	{
		Set<Character> set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0; i<s1.length(); i++)
		{
			Character c = s1.charAt(i);
		if(!set.contains(c))
		{
		set.add(c);
		sf.append(c);
		}
		
		}
		
		return sf.toString(); 
	}
}
