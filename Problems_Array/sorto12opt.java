public class Solution {
    public void sortColors(int[] nums) {

        int low =0;
        int temp;
        int temp1;
        int n = nums.length;
        int mid = 0;
        int high =  n-1;

        while(mid <=high)
        {
            if(nums[mid] == 0)
            {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid]= temp;
                mid ++;
                low ++;
            }
            else if(nums[mid] == 1)
            {
                mid ++;
            }
            else{
                
                temp1 = nums[mid];
                nums[mid] = nums[high];
                nums[high]= temp1;
                high--;
            }
        }
        
    }
} {
 
}
