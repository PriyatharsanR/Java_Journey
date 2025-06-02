public class Patterns
{
    public static void main(String[] args) 
    {
         System.out.println("Print pattern each row (1 2 3 4 5)");
        for(int i=0; i<5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        } 
        
        System.out.println("\n");
        

        System.out.println("Print row (1 1 1 1 1) , next row (2 2 2 2 2) & so on...");
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }  
        
        System.out.println("\n");
        
        
        System.out.println("Print row (2 3 4 5 6) , next row (3 4 5 6 7) & so on...");
        for(int i=2; i<=6; i++)
        {
            for(int j=i; j<=i+4; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        } 

        System.out.println("\n");
        
        
        System.out.println("Print row (1 2 3 4 5) , next row (6 7 8 9 10) & so on...");
        int count = 0;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                count++;
                System.out.format("%2d ",count);
            }
            System.out.println("");
        } 

    }    
}