package javaProgram;

import java.io.IOException;

public class Question05 {

	public static void main(String[] args) {
		
			    Question05Sub myref = new Question05Sub();
			    myref.test();
			  }
			  void test() throws IOException{
			    System.out.println("In Question05");
			    throw new IOException();
			  }
			}

			
	


