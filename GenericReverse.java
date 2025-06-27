package sveri;
public class Assignment {
    public static void main(String[] args) {
        // 1. Reverse a string using generic for loop
        String str = "Hello";
        String rev = "";
        for (char c : str.toCharArray()) rev = c + rev;
        System.out.println("Reversed: " + rev);

        // 2. Check if two elements exist in an array
        int[] arr = {1, 2, 3, 4};
        boolean found = false;
        for (int i : arr)
            for (int j : arr)
                if (i == 2 && j == 4)
                    found = true;

        System.out.println("2 and 4 exist: " + found);
    }
}
