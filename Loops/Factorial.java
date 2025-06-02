import java.util.Scanner;

public class Factorial 
{
     public static void main(String[] args) 
    {
        //---- Factorial of a number

        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        System.out.println("\n"); 
        int factorial=1;

        for(int i=1; i<=num; i++)
        {
            factorial = factorial * i;

        }

        System.out.println("Factorial of "+num+" is "+ factorial);
    }
}
