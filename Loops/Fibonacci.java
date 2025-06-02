import java.util.Scanner;

public class Fibonacci
{
    public static void main(String args[])
    {
        //---------- Fibonacci series -----------------
        Scanner s = new Scanner(System.in);
        System.out.println("Program to print Fibonacci series");
        System.out.print("Enter the number of terms : ");
        int n = s.nextInt();

        int a=0, b=1, c; 
        System.out.print(a+ ","+b+",");

        for(int i=0; i<n-2 ; i++)
        {
            c = a+b;
            System.out.print(c+",");
            a = b;
            b = c;

        }
    }
}
