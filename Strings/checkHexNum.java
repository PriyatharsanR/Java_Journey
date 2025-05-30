import java.lang.*;
import java.util.Scanner;

public class checkHexNum 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number. If number Hexadecimals it give true ");
        String str = s.nextLine();
        System.out.println(str.matches("[0-9 A-F]+"));
    }
}
