import java.util.Scanner;

public class LoopChallenge2 
{
    public static void main(String[] args) 
    {
        //Display digits of number , count the digits in a number & Reverse the number
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();

        int count = 0;
        int rev = 0;

        while(num != 0)
        {
            int r = num % 10;
            System.out.println(r);
            
            rev = rev*10+r;
            num /= 10;
            count++;
        }

        System.out.println(" ");
        
        System.out.println("Count digits of number: "+count+"\n");

        System.out.println("Reverse is: "+rev);
    }
}
