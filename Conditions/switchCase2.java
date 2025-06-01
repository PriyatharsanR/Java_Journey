import java.util.Scanner;

public class switchCase2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("-------- Menu -------");
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV\n");

        System.out.println("Enter the two numbers: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        s.nextLine();

        System.out.println("Enter option in words *use Capital letters");
        String option = s.nextLine();

        switch (option) {
            case "ADD":
                System.out.println("Sum is: "+ (a + b));
                break;
            case "SUB":
                System.out.println("Subtraction is : "+ (a - b));
                break;
            case "MUL":
                System.out.println("Production : "+(a * b));
                break;
            case "DIV":
                System.out.println("Division" + (a / b));
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
