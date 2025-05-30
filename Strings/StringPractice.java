import java.lang.*;
import java.util.*;

class StringPractice
{
	public static void main(String args[])
	{
		String str1 = "Learn Java";
		System.out.println(str1);

		String str2 = new String("Java");
		System.out.println(str2);

		char c[] = {'H', 'E', 'L', 'L', 'O'};
		String str3 = new String(c);
		System.out.println(str3);

		String str4 = new String(c,1,3); //here 1 is index1, 3 mean 3 letters
		System.out.println(str4);

		byte b[] = {65,66,67,68};
		String str5 = new String(b);
		System.out.println(str5);

		System.out.println(str1==str2);
	}
}