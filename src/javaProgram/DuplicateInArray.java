package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		String [] s = {"Java", "C", "C++", "Java", "Computer", "C++", "Google"};
		Set<String> se = new HashSet<String>();
		
		for(String str: s)
		{
			if(se.add(str) == false)
			{
				System.out.println("Duplicate Element" + str);
			}
		}

	}

}
