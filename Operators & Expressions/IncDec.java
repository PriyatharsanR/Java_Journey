public class IncDec {

    public static void main(String[] args) {
         
        
        int m=5, o;
        ++m;
        System.out.println(m);
        o = m++;  
        System.out.println(o+" "+m);
        

        int a=5,b;
        b = a++; //++a
        System.out.println(a+" "+b);
        


        int x=5,y=4,z;
        z=2 * x++ + 3 * ++y;
        System.out.println(z);



        char n = 'A'; //A means 65
        n++; //65+1=66 is B
        System.out.println(n);
    }
    
}