import java.lang.*;
import java.util.*;

public class checkBinaryNum 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number. If number is binary it give true ");
        int a = s.nextInt();
        String str = String.valueOf(a);
        System.out.println(str.matches("[01]+"));
    }
}
