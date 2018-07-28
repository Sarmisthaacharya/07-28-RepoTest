package javaProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PracticeDuplicateStringUsingSet {

	public static void main(String[] args) {
		
		String s ="I am learning java in java with Selenium in JAVA JAVA";
		
		String[] sa = s.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		for(String str : sa)
		{
			if(set.add(str) == false)
			{
				System.out.println("Duplicate Element:" + str);
				
			}
		
		}
		
		System.out.println(set);
		
		for(String s2: set)
		{
			System.out.print(s2 + " ");
		}
		
		String s1 = set.toString();
		System.out.println(s1);
	}

}
