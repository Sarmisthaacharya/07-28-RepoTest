package javaProgram;

public class PerfectNumber {
	
	public boolean perfectnumber(int number){
		int temp=0;
		for (int i=1; i<=number/2; i++)
		{
			if(number%i == 0)
			{
				temp += i;
			}
		}
			
		if(temp == number){
			System.out.println("perfect NUmber");
			return true;
		}
		else {
			System.out.println("not perfect NUmber");
			return false;
		}
	}

}
