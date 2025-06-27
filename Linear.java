package sveri;

public class LinearSearch
{
    public static <T> int linearSearch(T[] arr, T target) 
    {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != null && arr[i].equals(target))
                return i;
        return -1;
    }

    public static <T> void printResult(T[] arr, T target)
    {
        int idx = linearSearch(arr, target);
        
        if (idx != -1)
            System.out.println("Found element " + arr[idx] + " at index " + idx);
        else
            System.out.println("Element not found");
    }

    public static void main(String[] args) 
    {
        Integer[] nums = {1, 4, 2, 7};
        String[] words = {"apple", "banana", "cherry"};

        printResult(nums, 2);
        printResult(words, "banana");
    }
}
