import java.util.*;
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        int i;
        int n = arr.length;
        Arrays.sort(arr);
        for(i=0;i<n-1;i++)
        {
            if(i ==k-1)
            {
                return arr[i];
            }
        }

    }
}
