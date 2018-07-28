package javaProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReplaced {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
	    arrayList.add("A");
	    arrayList.add("B");
	    arrayList.add("D");

	    System.out.println(arrayList);
	    Collections.fill(arrayList, "REPLACED");
	    System.out.println(arrayList);

	  }


	}


