package javaProgram;

public class ExtractDigitsFromStringUsingSB {

	public static void main(String[] args) {
		
		String s = "Sap1ent";
		
		System.out.println(extractDigits(s));
		
	}
	
	public static String extractDigits(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=0; i<sb.length(); i++)
		{
			Character ch = sb.charAt(i);
			if(ch < 48 || ch>=57)
			{
				sb.deleteCharAt(i);
			i--;
			}
			
		}
		
		
		return sb.toString();
		
	}

}
