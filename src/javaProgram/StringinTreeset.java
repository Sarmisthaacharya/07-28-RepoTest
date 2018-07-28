package javaProgram;

import java.util.Comparator;
import java.util.TreeSet;

public class StringinTreeset {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		
		t.add("Jitu");
		t.add("Raj");
		t.add("Prabha");
		
		System.out.println(t);

	}

}
