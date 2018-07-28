package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArrayUsingSet {

	public static void main(String[] args) {
		
		String[] names = {"Ram", "Shyam", "Sita", "Ram", "Sita"};
		Set<String> store = new HashSet();
		
		for(String name: names)
		{
			if(store.add(name) == false)
			{
				System.out.println("Duplicate element is" +" " + name);
			}
		}

	}

}
