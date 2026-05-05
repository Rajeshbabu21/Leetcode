import java.util.*;
class Solution {
    public void reverseArray(int arr[]) {
        ArrayList<Integer> dummy = new ArrayList<>();
        
        int n = arr.length;
        
        for(int i=n-1;i>=0;i--)
        {
            dummy.add(arr[i]);
        }
        
        for(int i=0;i<dummy.size();i++)
        {
            arr[i] = dummy.get(i);
        }
        
        
    }
}