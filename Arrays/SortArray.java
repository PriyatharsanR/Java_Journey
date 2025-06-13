public class SortArray 
{
    public static void main(String[] args) 
    {
        String words[] = {"House", "School", "Library", "Books", "Foods", "Apple", "Orange"};
        
        java.util.Arrays.sort(words);

        for(String x : words)
            System.out.println(x);
    }    
}
