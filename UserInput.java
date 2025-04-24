import java.lang.*;
import java.util.*;

class UserInput
{
	public static void main(String args[])
	{
		Scanner S= new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = S.nextLine();
		
		System.out.println("Welcome Mr./Mrs. "+name);
		
	}
}