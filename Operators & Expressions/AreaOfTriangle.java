import java.lang.*;
import java.util.*;

public class AreaOfTriangle 
{
    public static void main(String[] args) 
    {
        float base,height,area;
        System.out.print("Enter Base and Height: ");
        Scanner s =new Scanner(System.in);
        base = s.nextFloat();
        height = s.nextFloat();

        area = base*height*0.5f;
        //area=1f/2f*base*height;
        //area=base*height/2;
        System.out.println("Area of Triangle is "+area);
    }
    
    
}