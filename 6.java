package generics;
public class CheckTwoElements 
{
    public static <T> void checkElements(T[] array, T a, T b) 
  {
        int i1 = -1, i2 = -1;
        for (int i = 0; i < array.length; i++)
          {
            i1 = array[i].equals(a) ? i : i1;
            i2 = array[i].equals(b) ? i : i2;
        }
System.out.println((i1 != -1 && i2 != -1)? a + " at " + i1 + "\n" + b + " at " + i2 : "Not found");
    }

    public static void main(String[] args)
  {
        String[] arr = {"sanika", "pranali", "sukanya", "gauri", "srushti"};
        checkElements(arr, "sukanya", "gauri");
    }
}
