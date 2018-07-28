package javaProgram;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateWord {

	public static void main(String[] args) {

       String s = "I I am Learning java java";
		
		findDuplicateWord(s);
		

	}

	public static void findDuplicateWord(String s) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		String[] str = s.split(" ");
		
		for(String temp: str)
		{
			if(hm.get(temp) != null)
			{
				hm.put(temp, hm.get(temp) + 1);
			}
			else
			{
				hm.put(temp, 1);
			}
		}
		System.out.println(hm);
		
		Iterator<String> it = hm.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			if(hm.get(key) > 1)
			{
				System.out.println("The word " + key + " appreared " + hm.get(key) + " times");
			}
		}
	}

}
