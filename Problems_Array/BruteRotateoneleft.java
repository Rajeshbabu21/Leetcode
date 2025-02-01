import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> number = new ArrayList<>();
        int n = nums.length;

        while(k !=0)
        {
            number.clear();
        int last = nums[n-1];

        for(int i=0;i<n-1;i++)
        {
            number.add(nums[i]);
        }

        number.add(nums[0]);

        for(int i=0;i<number.size();i++)
        {
            nums[i] = number.get(i);
        }

        k--;

        }

    
        
    }
}