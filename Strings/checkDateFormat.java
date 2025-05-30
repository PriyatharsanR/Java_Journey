import java.util.Scanner;

public class checkDateFormat 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the date. If it is (dd/mm/yyyy) format, it give true ");
        String date = s.nextLine();
        System.out.println(date.matches("[0-3][0-9]/[0|1][0-9]/[0-9]{4}"));
    }
}
