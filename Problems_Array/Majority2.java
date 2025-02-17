class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> number = new ArrayList<>();
        

        for(int i=0;i<nums.length;i++)
        {
            if(number.isEmpty() || !number.contains(nums[i]) )
            {
                int count = 0;
                for(int j= 0;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    count ++;
                }
            }

            
            if(count > nums.length/3)
            {
                 number.add(nums[i]);
            }

            }
            

        }

        return number;
        
    }
}