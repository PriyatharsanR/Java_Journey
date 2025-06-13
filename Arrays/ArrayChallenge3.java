import java.util.Scanner;

public class ArrayChallenge3 
{
    public static void main(String[] args) 
    {
        //Insert an element into the array 
        int A[] = new int[10];
        A[0]=5; A[1]=9; A[2]=6; A[3]=10; A[4]=12; A[5]=7;

        int n =6;
        for(int i=0; i<n; i++)
            System.out.print(A[i]+",");
        System.out.println("");

        int x = 20;
        int index = 2;

        for(int i=n; i>index; i--)
            A[i] = A[i-1];

        A[index]=x;
        n++;

        for(int i=0; i<n; i++)
            System.out.print(A[i]+",");
        System.out.println("");

        
        //Delete an element
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the index of delete element: ");
        index = s.nextInt();

        for(int i=index; i<n; i++)
            A[i] = A[i+1];

        n--;
        for(int i=0; i<n; i++)
            System.out.print(A[i]+",");
        System.out.println("");
        
        
    }
}
