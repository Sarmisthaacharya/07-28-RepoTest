package javaProgram;

import java.util.TreeSet;

public class NumericListsorting {

	public static void main(String[] args) {
		TreeSet <Integer> ts = new TreeSet <Integer>(new MyComparator1());
		
		ts.add(100);
		ts.add(67);
		ts.add(50);
		
		System.out.println(ts);

	}




}


