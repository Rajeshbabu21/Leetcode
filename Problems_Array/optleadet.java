

// } Driver Code Ends



import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> number = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        // Traverse from the right side
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                number.add(arr[i]);
                max = arr[i];
            }
        }

        // Reverse to get the correct order
        Collections.reverse(number);
        
        return number;
    }
}
