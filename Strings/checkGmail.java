import java.util.Scanner;

public class checkGmail 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the mail. if this mail is gmail form, it give true ");
        String str = s.nextLine();
        System.out.println(str.endsWith("@gmail.com"));

        //find username and domain name

        int i = str.indexOf('@');
        System.out.println(i);

        String uName = str.substring(0,i);
        System.out.println("Username: "+uName);

        String dName = str.substring(i+1);
        System.out.println("Domain name: "+dName);
    }
}
