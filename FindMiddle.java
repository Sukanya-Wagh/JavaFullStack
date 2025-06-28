package generics;
public class MiddleElement 
{
    public static <T> T findMiddleElement(T[] array)
  {
        if (array == null || array.length == 0) 
        {
            return null;
        }
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        System.out.println(findMiddleElement(intArray));

        String[] strArray = {"Sanika", "Pranali", "Sukanya", "Srushti", "Muskan"};
        System.out.println(findMiddleElement(strArray));
    }
}
