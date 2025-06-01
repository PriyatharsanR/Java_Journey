import java.net.SocketPermission;
import java.util.Scanner;

public class conditionsChallenge4 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the website url: ");
        String url = s.nextLine();

        int i = url.lastIndexOf(".");
        int x = url.indexOf(":");

        String protocol = url.substring(0, x);
        String typeWeb = url.substring(i+1);

        if (protocol.equals("https"))
            System.out.println("HyperText Transfer Protocol");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");

        if(typeWeb.equals("com") || typeWeb.equals("com/"))
            System.out.println("Commercial website");
        else if(typeWeb.equals("org") || typeWeb.equals("org/"))
            System.out.println("Organization website");
        else if(typeWeb.equals("net") || typeWeb.equals("net/"))
            System.out.println("Network website");
        


    }
}
