import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> number = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                
            }
            else{
            map.put(nums[i],1);
            number.add(nums[i]);
            }

           
        }
        int count = 0 ;
        for(int i=0;i<number.size();i++)
        {
            count +=1;

            nums[i] = number.get(i);
        }

        return count;
        
    }
}