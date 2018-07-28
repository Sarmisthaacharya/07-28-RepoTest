package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		
			
			String s1 = "Sarmistha";
			removeDuplicates(s1);
				
			
		}

		public static void removeDuplicates(String s1)
		{
			Set<Character> set = new HashSet<Character>();
			
			for(int i=0; i<s1.length(); i++)
			{
			Character c = s1.charAt(i);	
			System.out.print(set.add(c));
			
			}
			
			
			
			 
		}

	}


