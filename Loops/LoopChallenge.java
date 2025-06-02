import java.util.Scanner;

public class LoopChallenge 
{
    public static void main(String[] args) 
    {
        //---- Display Multiplication table

        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        System.out.println("\n");
        System.out.println("Multiplication Table of Number "+num);

        for(int i=1; i<=10; i++)
        {
            System.out.println(num+" * "+i+" = "+ (num*i));
        }
    }
}
