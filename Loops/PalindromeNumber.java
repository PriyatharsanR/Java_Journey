import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        //Check a number is palindrome
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        
        int rev = 0;
        int m = num;

        
        while(num != 0) 
        {
            int r = num % 10;
            rev = rev*10+r;
            num /= 10;
        }

        if (m == rev)
        {
            System.out.println("It's Palindrome number.");
        }
        else
            System.out.println("It's not a palindrome number.");

    }
}