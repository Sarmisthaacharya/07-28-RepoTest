package javaProgram;

public class ThreadDepositWithdraw {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		ChildThread1 t1 = new ChildThread1(c, 100000);
		ChildThread2 t2 = new ChildThread2(c, 150);
		
		t1.start();
		t2.start();
		

	}

}
