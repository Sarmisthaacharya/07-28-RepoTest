package javaProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread extends Thread {

	static ArrayList<String> l = new ArrayList<String>();

	public void run() {
		//try {
			//Thread.sleep(2000);
		//} catch (InterruptedException e) {
			//System.out.println("Child thread");
			l.add("D");
		//}

	}

	public static void main(String[] args) throws InterruptedException {

		l.add("A");
		l.add("B");
		l.add("C");

		MyThread t = new MyThread();

		t.start();

		Iterator<String> itr = l.iterator();

		while (itr.hasNext()) {
			String s = (String) itr.next();
			Thread.sleep(3000);
			l.add("E");
			System.out.println(s);
			
		}
		System.out.println(l);

	}

}
