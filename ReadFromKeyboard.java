import java.lang.*;
import java.util.*;

class ReadFromKeyboard
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		
		int a, b, c;
		System.out.println("Enter two numbers");

		a = S.nextInt();
		b = S.nextInt();
		c = a + b;

		System.out.println("C value is "+ c);
	}
}
