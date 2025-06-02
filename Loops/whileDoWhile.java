public class whileDoWhile 
{
    public static void main(String[] args) 
    {
        int i = 1;

        //----  WHILE LOOP  ----
        while (i < 100)
        {
            System.out.println(i);
            i *= 2;
        }

        System.out.println("\n");


        //----   DO.. WHILE LOOP
        int j = 1;
        do
        {
            System.out.println(j);
            j *= 2;
        } while(j < 100);
    }
}
