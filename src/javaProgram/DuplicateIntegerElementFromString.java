package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateIntegerElementFromString {

	public static void main(String[] args) {
		
		Integer[] s1= {100, 5, 8, 5};
		Set<Integer> store = new HashSet<Integer>();
		
		for(Integer i : s1)
		{
			if(store.add(i) == false)
			{
				System.out.println("Duplicate element" + i);
			}
		}

	}

}
