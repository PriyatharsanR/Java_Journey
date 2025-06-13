import java.util.Scanner;

public class ArrayChallenge2
{
    public static void main(String[] args) 
    {
        //Searching an Element
        
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int sum = 0;
        Scanner s= new Scanner(System.in);

        System.out.print("Enter the search key: ");
        int key = s.nextInt();

        for(int i=0; i<A.length; i++)
        {
            if (key == A[i])
            {
                System.out.println("\nIndex of key: "+i);
                System.exit(0);
            }  
        }
        System.out.println("Not found!..");

    }
}
