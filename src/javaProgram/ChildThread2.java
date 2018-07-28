package javaProgram;

public class ChildThread2 extends Thread {
	Customer c;
	int amount;
	
	ChildThread2(Customer c, int amount)
	{
		this.c = c;
		this.amount = amount;
	}

	public void run()
	{
		c.deposit(amount);;
		
	}
}
