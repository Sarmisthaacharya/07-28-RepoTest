package javaProgram;

public class ChildThread1 extends Thread {
	
	Customer c;
	int amount;
	
	ChildThread1(Customer c, int amount)
	{
		this.c = c;
		this.amount = amount;
	}

	public void run()
	{
		c.withdraw(amount);
		
		
	}
}
