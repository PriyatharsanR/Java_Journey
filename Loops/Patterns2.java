public class Patterns2
{
    public static void main(String[] args) 
    {
         System.out.println("Print pattern firstr row (1), next (1 2), next (1 2 3), so on...");
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        } 
        
        System.out.println("\n");
        
        
        System.out.println("Print pattern firstr row (1), next (2 3), next (4 5 6), so on...");
        int count = 0;
        for(int i=1; i<=5; i++)
        { 
            for(int j=1; j<=i; j++)
            {
                count++;
                System.out.format("%2d ",count);
            }
            System.out.println("");
        } 

        System.out.println("\n");
        
        
        System.out.println("Print row (1 2 3 4 5) , next row (1 2 3 4 ) & so on...");
        for(int i=5; i>=1; i--)
        { 
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        } 

        System.out.println("\n");
        
        
        System.out.println("Print row (* * * * *) , next row (  * * * *) & so on...");
        for(int i=1; i<=5; i++)
        { 
            for(int j=1; j<=5; j++)
            {
                if (j >= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        } 

        System.out.println("\n");
        
        
        System.out.println("Print row (        *) , next row (      * *) & so on...");
        for(int i=1; i<=5; i++)
        { 
            for(int j=1; j<=5; j++)
            {
                if (i + j > 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        } 

        System.out.println("\n");
        
        
        System.out.println("Print Pyramid Pattern");
        for (int i = 1; i <= 5; i++) 
        { 
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println(); 
        }
    
    }
      
}