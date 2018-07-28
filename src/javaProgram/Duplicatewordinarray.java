package javaProgram;

public class Duplicatewordinarray {

	public static void main(String[] args) {
		
		String[] comp = {"Java", "javascript", "C", "C", "PHP", "Java"};
		
		for(int i=0; i<comp.length; i++){
			for(int j=i+1; j<comp.length; j++)
			{
				if(comp[i].equals(comp[j]))
				{
					System.out.println("Duplicate : " + comp[i]);
				}
					
			}
		}

	}

}
