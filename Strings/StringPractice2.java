import java.lang.*;
import java.util.*;

class StringPractice2
{
	public static void main(String args[])
	{
		String str1 = new String("   Priyatharsan   ");
		System.out.println(str1);

		//remove the blank spaces
		String str = str1.trim();
		System.out.println(str);

		//get the length of the word
		int len = str.length();
		System.out.println(len);

		//change the word to uppercase
		String str2 = str.toUpperCase();
		System.out.println(str2);

		//change the word to lowercase
		String str3 = str.toLowerCase();
		System.out.println(str3);

		//get word's letter from any position
		//String str4 = str.substring(5);
		String str4 = str.substring(0, 3);
		System.out.println(str4);

		//replace word letter
		String str5 = str.replace('t', 'd');
		System.out.println(str+"  "+str5);

		//check the word start with this letter - give true or false
		System.out.println(str.startsWith("P"));
		System.out.println(str.startsWith("t"));
		System.out.println(str.startsWith("t",5)); 

		//check the word ends with this letter - give true or false
		System.out.println(str.endsWith("n"));
		System.out.println(str.endsWith("san"));

		//get the character of particular index
		System.out.println(str.charAt(5)); 

		for(int i=0; i<str.length(); i++)
			System.out.print(str.charAt(i)+" ");
		
		System.out.println();

		//search the index of particular letter
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("tharsan"));
		System.out.println(str.lastIndexOf("a"));
	}
}   