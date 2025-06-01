import java.util.*;

public class challenge1 
{
    public static void main(String args[])
    {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Name : ");
        String name = s.nextLine();

        System.out.println("Enter Age : ");
        int age = s.nextInt();
        s.nextLine();

        System.out.println("Enter Registration no : ");
        String rNo = s.nextLine();

        int i;
        double[] marks = new double[3];
        double total = 0;

        for (i=0; i<3; i++)
        {
            System.out.println("Enter the marks"+i+1);
            marks[i] = s.nextDouble();
            total += marks[i];
        }

        double avg = total / 3;


        System.out.println("\n-----  Student Inormation -----");
        System.out.println("Student Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Registration No: "+rNo);
        System.out.println("Total Marks: "+total);
        System.out.printf("Average marks: %.2f\n", avg);

        if(avg >= 75)
            System.out.println("Grade: A");
        else if(avg >= 60)
            System.out.println("Grade: B");
        else if(avg >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: B");

    }
}
