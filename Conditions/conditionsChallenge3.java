import java.lang.*;
import java.util.*;

public class conditionsChallenge3 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        String n = s.nextLine();

        if(n.matches("[01]+"))
        {
            System.out.println("Binary radix=2");
        }
        else if (n.matches("[0-7]+")) {
            System.out.println("Octel radix=8");
        }
        else if(n.matches("[0-9]+"))
        {
            System.out.println("Decimal radix=10");
        }
        else if(n.matches("[0-9A-F]+"))
        {
            System.out.println("HexDecimal radix=16");
        }
        else
            System.out.println("Not a number");  
    }
}
