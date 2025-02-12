class Solution {

    public boolean ls(int[] nums, int x) {
        for (int num : nums) {
            if (num == x) {
                return true;
            }
        }
        return false;  // Return false only after checking all elements
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;  // Handle empty array case

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int count = 1;

            while (ls(nums, x + 1)==true) {
                x = x + 1;
                count++;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}
