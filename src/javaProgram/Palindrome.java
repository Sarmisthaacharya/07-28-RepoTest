package javaProgram;

public class Palindrome {
	int number;
	public void palindrome(int num){
		number=num;
				int rev = 0;
		while (number!=0)
		{
		rev=rev * 10 +number%10;
		number=number/10;
				}
		
		
		if(num==rev)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome number");
		}
	}

	}
