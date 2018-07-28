package javaProgram;

import java.util.ArrayList;
import java.util.List;

public class Practice03 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		
		li.add("a2");
		li.add("a3");
		li.add("a4");
		
		System.out.println(li.size());
		
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
			
				
		

	}

}
