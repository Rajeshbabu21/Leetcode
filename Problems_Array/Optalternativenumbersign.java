public class Optalternativenumbersign {
 
}
import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        // ArrayList<Integer> number = new ArrayList<>();
        int[] number = new int[n];

        int pos = 0;
        int neg = 1;

        for(int i=0;i<n;i++)
        {
            if(nums[i]  > 0)
            {
                number[pos] = nums[i];
                pos +=2;
            }

            else{

                number[neg] = nums[i];
                neg +=2;
            }
        }

        return number;
        
        
    }
}