
public class MinMaxFinder {
    public static <T extends Comparable<T>> void printMinMax(T[] arr) {
        T min = arr[0], max = arr[0];
        for (T x : arr) {
            if (x != null) {
                if (x.compareTo(min) < 0) min = x;
                if (x.compareTo(max) > 0) max = x;
            }
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 2, 9, 1, 7};
        String[] words = {"pear", "apple", "orange"};

        printMinMax(nums);
        printMinMax(words);
    }
}
