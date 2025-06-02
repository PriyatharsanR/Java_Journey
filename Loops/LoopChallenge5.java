import java.util.Scanner;

public class LoopChallenge5
{
    public static void main(String args[])
    {
        //---------- Print GP series -----------------
        Scanner s = new Scanner(System.in);
        System.out.println("Program to print GP series");
        System.out.println("Enter a, d and n");
        int a = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();
        int term = a;

        System.out.print("GP series : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(term+",");
            term *= d;

        }
    }
}
