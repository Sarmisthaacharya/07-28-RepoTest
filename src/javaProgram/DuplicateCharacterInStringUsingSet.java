package javaProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacterInStringUsingSet {

	public static void main(String[] args) {
	
		String s = "Sarmistha Acharya";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		StringBuffer sb = new StringBuffer();
		
		//char[] ch = s.toCharArray();
		
		for(int i=0; i<s.length(); i++)
		{
			Character c = s.charAt(i);
			if(set.add(c) == false)
			{
				System.out.println("Duplicate Character:" + c);
			}
			else
			{
				sb.append(c);
			}
			
		}
		
		System.out.println(sb);

	}

}
