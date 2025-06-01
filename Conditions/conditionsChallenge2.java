import java.lang.*;
import java.util.*;

public class conditionsChallenge2 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int n = s.nextInt();

        if(n>=14 && n<=55)
        {
            System.out.println("You are young");
        }
        else
            System.out.println("Not young");
    }
}
