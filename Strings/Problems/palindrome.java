
class Solution {
    boolean isPalindrome(String s) {
        
        // s.Arrays.toString(s.toCharArray());
        
        
        
        
        
        
        for(int i = 0;i<s.length()/2;i++)
        {
            
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if(start != end)
            {
                return false;
            }
        }
        
        return true;
    }
};