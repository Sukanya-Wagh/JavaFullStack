package tyif;
public class Occurance 
{
    public static <T> int count(T[] a, T t) 
    {
        int c = 0;
        for (T x : a)
        if (x != null && x.equals(t)) c++;
        return c;
    }

    public static void main(String[] args) {
        Integer[] n = {1, 4, 2, 3};
        String[] s = {"a", "b", "a"};
        System.out.println(count(n, 2)); 
        System.out.println(count(s, "a")); 
    }
}
