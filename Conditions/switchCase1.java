import java.util.Scanner;

public class switchCase1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter website url");
        String url = s.nextLine();

        String ext = url.substring(url.lastIndexOf(".")+1);

        switch(ext)
        {
            case "com": System.out.println("Commercial");
                break;
            case "org": System.out.println("Organization");
                break;
            case "net": System.out.println("Network");
                break;
            case "gov": System.out.println("Government");
                break;
            default: System.out.println("Invalid url type");
                break;
        }
    }
}
