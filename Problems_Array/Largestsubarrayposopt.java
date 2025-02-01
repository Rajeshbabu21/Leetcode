import java.util.* ;
import java.io.*; 
public class Largestsubarrayposopt {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int right = 0;
		int left = 0;
		int sum = nums[0];
		int len = 0;
		int n = nums.length;

		while(right  < n)
		{
			
			while(left<=right && sum > k)
			{
				sum = sum-nums[left];
				left++;
			}
			if(sum == k)
			{
				len = Math.max(len,right-left +1);
			}
			

			right++;
			if(right < n)
			{
				sum += nums[right];
			}
			

			
			

		}

		return len;
	}
}