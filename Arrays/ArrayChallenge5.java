public class ArrayChallenge5 
{
    public static void main(String[] args) 
    {
        //Adding two matrices
        int A[][] = {{3,5,9},
                     {7,6,2},
                     {4,3,5}};

        int B[][] = {{1,5,2},
                     {6,8,4},
                     {3,9,7}};

        int C[][] = new int[3][3];

        System.out.println("Adding two matrices");
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[0].length; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }

        //To print
     /*    for(int x[] : C)
        {
            for(int y : x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");           
        }  */



        //Multiplying two matrices
        int D [][] = new int[3][3];

        System.out.println("");
        System.out.println("Multiplying two matrices");
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[0].length; j++)
            {
                D[i][j] = 0;
                for(int k=0; k<3; k++)
                {
                    D[i][j] = D[i][j]+ A[i][k] * B[k][j];
                }
            }
            
        }
       

        for(int x[] : D)
        {
            for (int y : x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }    
}
