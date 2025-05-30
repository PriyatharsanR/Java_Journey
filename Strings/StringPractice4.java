import java.lang.*;
import java.util.*;

public class StringPractice4 
{
    public static void main(String args[])
    {
        String str = "a";
        //String str = "ab";
        //String str = "7";
        //String str = "%";
        //String str = "ab3@%";
        //System.out.println(str.matches(".")); //one any charcter posible


        String str1 = "a";
        //String str1 = "b";
        //String str1 = "ab";
        //String str1 = "abc";
        //String str1 = "7";
        //String str1 = "a5";
        //String str1 = "ab3@%";
        //System.out.println(str1.matches("[abc]")); //only one charcter from abc possible


        String str2 = "a";
        //String str2 = "p";
        //String str2 = "n";
        //String str2 = "abc";
        //String str2 = "7";
        //String str2 = "hi";
        //String str2 = "ab3@%";
        //System.out.println(str2.matches("[^abc]")); //only one charcter without abc possible


        String str3 = "a";
        //String str3 = "b";
        //String str3 = "ab";
        //String str3 = "7";
        //String str3 = "a5";
        //String str3 = "ab3@%";
        //System.out.println(str3.matches("[a-z 0-9]")); //only one character from a-z or 0-9 possible

        //String str4 = "a";
        //String str4 = "b";
        //String str4 = "ab";
        //String str4 = "7";
        String str4 = "b9";
        //String str4 = "a5";
        //String str4 = "ab3@%";
        //System.out.println(str4.matches("[a-z][0-9]")); //character from a-z and 0-9 possible


        String str5 = "a";
        //String str5 = "b";
        //String str5 = "ab";
        //String str5 = "7";
        //String str5 = "b9";
        //String str5 = "a5";
        //String str5 = "ab3@%";
        //System.out.println(str5.matches("a|b")); //character from a or b only possible


        //String str6 = "a";
        //String str6 = "b";
        String str6 = "ab";
        //String str6 = "7";
        //String str6 = "b9";
        //String str6 = "a5";
        //String str6 = "ab3@%";
        //System.out.println(str6.matches("ab")); // ab only possible


        String str7 = "a";
        //String str7 = "b";
        //String str7 =  "ab";
        //String str7 = "7";
        //String str7 = "b9";
        //String str7 = "a5";
        //String str7 = "ab3@%";
        //System.out.println(str7.matches(".*")); // any charcter 0 or many time possible


        //String str8 = "a";
        //String str8 = "b";
        //String str8 =  "abcabc";
        //String str8 = "7";
        String str8 = "aaabbbcccc";
        //String str8 = "aaa7";
        //String str8 = "ab3@%";
        //System.out.println(str8.matches("[abc]*")); // a, b , c  0 or many time possible


        //String str9 = "a";
        //String str9 = "b";
        String str9 =  "apple";
        //String str9 = "74656";
        //String str9 = "bake9";
        //String str9 = "school";
        //String str9 = "climb";
        //String str9 = "ab3@%";
        System.out.println(str9.matches("[a-z]{5}")); // a-z charcters five times only possible
    }
}
