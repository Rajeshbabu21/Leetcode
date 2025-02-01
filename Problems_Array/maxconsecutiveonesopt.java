class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int cnt = 0;
        int max= 0;
        int n  = nums.length;

        for(int i=0;i<n;i++)
        {
            if(nums[i] == 1)
            {
                cnt +=1;
                // max +=1;
                max = Math.max(max,cnt);
            }
            else{
                cnt = 0;
            }
        }

        return max;
        
    }
}