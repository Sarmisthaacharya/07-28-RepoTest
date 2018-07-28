package javaProgram;

import java.util.LinkedList;
import java.util.ListIterator;

public class Navigation {

	public static void main(String[] args) {
		{
			LinkedList<String> l=new LinkedList <String>();
			l.add("Sidhant");
			l.add("Anubhav");
			l.add("Babushan");
			l.add("Arindam");
			System.out.println(l);
			ListIterator<String> li=l.listIterator();
			while(li.hasNext())
			{
			String s=(String)li.next();
			if(s.equals("Arindam"))
			{
			li.remove();
			}
			else
			if(s.equals("Babushan"))
			{
			li.add("Amlan");
			}
			else
			if(s.equals("Anubhav"))
			{
			li.set("Budhaditya");
			}
			}
			System.out.println(l);
			}
			}

	}


