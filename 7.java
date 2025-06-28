package generics;
public class SubstringOccurrence 
{
    public static void findSubstring(String text, String sub)
  {
        int i = 0, c = 0;
        while ((i = text.indexOf(sub, i)) != -1)
          {
            System.out.println("Found at: " + i + " to " + (i + sub.length() - 1));
            c++;
            i++;
        }
        System.out.println(c > 0 ? "Total: " + c : "Not found");
    }

    public static void main(String[] args)
  {
        String text = "Rust's rich type system and ownership model guarantee memory-safety and thread-safety - enabling you to eliminate many classes of bugs at compile-time.";
        findSubstring(text, "safety");
    }
}
