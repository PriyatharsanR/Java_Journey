import java.lang.*;
import java.util.Scanner;

class TriangleArea
{
	public static void main(String args[])
	{
		float base, height, area;

		System.out.println("Enter the base: ");
		Scanner s = new Scanner(System.in);
		base = s.nextFloat();
		
		System.out.println("Enter the height: ");
		height = s.nextFloat();

		area =base * height / 2;

		System.out.println("The Triangle area is: "+ area);
	}
}