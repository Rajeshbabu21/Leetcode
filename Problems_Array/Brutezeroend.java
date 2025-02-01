import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> number0 = new ArrayList<>();
        ArrayList<Integer> number1 = new ArrayList<>();

        int n = nums.length;

        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
            {
                number0.add(nums[i]);
            }
            else{
                number1.add(nums[i]);
            }
        }

        int f = number1.size();

        for(int i = 0;i<f;i++)
        {
            nums[i] = number1.get(i);
        }

        int j= 0;
        for(int i = f;i<n;i++)
        {
            nums[i] = number0.get(j);
            j++;
        }



        
    }
}