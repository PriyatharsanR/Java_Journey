import java.lang.*;

class Literals
{
	public static void main(String args[])
	{
		// byte, short, and int are integer literals

		byte b = 5;
		short s = 100;
		int i = 1500;


		// Long numbers are long literals, they must end with 'L' or 'l'
		long l = 11002535524L;


		// Floating-point numbers are double literals by default; use 'f' or 'F' for float
		float f = 25.50f;  
		double d = 15000.75; 

		char c = 'P'; // Character Literals
		String S = "Java";  // String Literals

		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(S);
	}
}