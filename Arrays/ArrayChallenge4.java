public class ArrayChallenge4 
{
    public static void main(String[] args) 
    {
        //Copying an array
        int A[] = {8,6,10,9,2,15,7,13,14,11};
        int B[] = new int[A.length];

        for(int i=0; i<A.length; i++)
        {
            B[i] = A[i];
        }

        System.out.print("Array A: ");
        for(int x : A)
            System.out.print(x+",");
        System.out.println("");

        System.out.print("Array B: ");
        for(int x : B)
            System.out.print(x+",");
        System.out.println("\n");


        //Reverse copy of Array A
        int n=0;
        for(int i=A.length-1; i>=0; i--)
        {
            B[n] = A[i];
            n++;
        }

        System.out.print("Reverse copy of A: ");
        for(int x : B)
            System.out.print(x+",");
        System.out.println("\n");

    }    
}
