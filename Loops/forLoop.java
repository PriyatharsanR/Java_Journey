public class forLoop 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
        }

        System.out.println("");

        for(int x=1, y=1; x<10; x++,y*=2)
        {
            System.out.println(x+" "+y);
        }
    }
}
