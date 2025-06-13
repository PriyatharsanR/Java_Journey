import java.lang.*;

public class Arrays1 
{
    public static void main(String[] args) 
    {
        int A[] = new int[10];

        int B[] = {1,2,3,4,5};

        int C[];
        C = new int[10];

        B[2] = 10;

        for(int i=0; i<A.length; i++)
        {
            System.out.println(A[i]);
        }

        for(int x:B)
        {
            System.out.println(x);
        }
    }
}