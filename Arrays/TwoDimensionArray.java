public class TwoDimensionArray 
{
    public static void main(String[] args) 
    {
        int A[][]= {{1,2,3,4},
                    {2,4,6,8},
                    {3,5,7,9}};
                    
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[0].length; j++)
            {
                System.out.print(A[i][j]+",");
            }
            System.out.println("");
        }

        System.out.println("");


        //Another method to print
        for(int x[] : A)
        {
            for(int y : x)
            {
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}
