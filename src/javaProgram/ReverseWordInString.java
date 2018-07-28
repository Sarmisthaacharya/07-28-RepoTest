package javaProgram;

public class ReverseWordInString {

	public static void main(String[] args) {
		String s1 = "Welcome to geeksforgeeks";
        System.out.println(reverseWords(s1));
 
        String s2 = "I love Java Programming";
        System.out.println(reverseWords(s2));

        String s3 = "Test Automation";
        System.out.println(reverseWords(s3));
	}
	
	static String reverseWords(String str)
    {
 
        // Specifying the pattern to be searched
       
 
        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        //  is whitespace and store in temp array.
        String[] temp = str.split(" ");
        String result = "";
        System.out.println(temp.length);
 
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
 

}
