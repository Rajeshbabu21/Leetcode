class Solution {
    public void rotate(int[] nums, int k) {

        while(k != 0)
        {

        

        int temp = nums[0];

        for(int i=1;i<n;i++)
        {
            nums[i-1] = nums[i];
        }

        k--;
        }
        
    }
}