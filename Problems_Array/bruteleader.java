public import java.util.*;

public class Solution {
    public static List<Integer> superiorElements(int[] a) {
        List<Integer> result = new ArrayList<>();
        int n = a.length;

        for (int i = 0; i < n; i++) {
            boolean isSuperior = true;

            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {  // If any element to the right is greater
                    isSuperior = false;
                    break;
                }
            }

            if (isSuperior) {
                result.add(a[i]);  // Add to the result if it's superior
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 3, 5, 2};
        System.out.println(superiorElements(arr)); // Test the function
    }
}
 {
 
}
