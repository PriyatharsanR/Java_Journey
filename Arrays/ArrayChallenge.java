public class ArrayChallenge 
{
    public static void main(String[] args) 
    {
        //Finding Sum of all elements
        //Finding Maximum element
        //Finding Second largest element
        
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int sum = 0;
        int max = 0;
        int max2 = 0;

        System.out.print("Elements: ");
        for(int i=0; i<A.length; i++)
        {
            System.out.print(A[i]+" ");
            sum += A[i];

            if (A[i] >= max)
            {
                max2 = max;
                max = A[i];
            }
        }

        System.out.println("\nSum of all Elements is: "+sum);
        System.out.println("Maximum element is: "+max);
        System.out.println("Second largest element is: "+max2);
    }
}
