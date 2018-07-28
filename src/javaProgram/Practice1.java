package javaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Practice1 {

	public static void main(String[] args) {

		int k=1;
		for(int i=1; i<=3; i++)
		{
			int n=1;
			for(int j=1; j<=k; j++)
			{
			
			 System.out.print(n + " ");	
			 n++;
			}
		
			System.out.println();
			k=k+2;
		}

		System.out.println("*****************************");
		
		ArrayList<String> li = new ArrayList<String>();
		li.add("Banana");
		li.add("Kiwi");
		li.add("Mango");
		li.add("Apple");
		li.add("Kiwi");
		li.add("Banana");
		
		System.out.println(li);
		
		Collections.sort(li);
		
		System.out.println(li);
		
		HashSet<String> hs = new HashSet<String>(li);
		
		System.out.println(hs);
		
		li.clear();
		
		System.out.println(li);
		
		li.addAll(hs);
		
Collections.sort(li, Collections.reverseOrder());
System.out.println(li);
				
	

	System.out.println("*****************************");
	
	String str = "SAPIENT";
	
	String reverse = "";
	
	for(int i=str.length()-1; i>=0; i--)
	{
		reverse = reverse + str.charAt(i);
	}
	
	System.out.println(reverse);
	
	System.out.println("**********************************");
	
	String str1 ="HELLO WORLD";
	String reverse1 = "";
	
	for(String rev: str1.split(" "))
	{
		for(int id=rev.length()-1; id>=0; id--)
		{
		
		reverse1 = reverse1 + rev.charAt(id);
		System.out.print(" ");
		
		}
	}
	
	System.out.println(reverse1);
	
	System.out.println("**************************************");
	
	String str2 = "Test Automation";
	
	String reverse2 = "";
	
	String[] c = str2.split(" ");
	
	for(int i = c.length-1; i>=0; i--)
	{
		reverse2 = " " + reverse2;
		
	}
	
	System.out.println(reverse2);	
	
}
	
	
}
