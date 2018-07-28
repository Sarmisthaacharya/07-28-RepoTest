package javaProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> nums = new ArrayList<String>();
	    nums.add("O");
	    nums.add("Two");
	    nums.add("Three");
	    nums.add("Four");

	    String s;
	    Iterator<String> e = nums.iterator();
	    while (e.hasNext()) {
	      s = e.next();
	      System.out.println(s);
	    }
	}

}
