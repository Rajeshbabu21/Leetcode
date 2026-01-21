class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = arr.length;
        int max = arr[0];
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        ans.add(min);
        
        for(int i=0 ;i<n;i++)
        {
            if (arr[i]  > max)
            {
                max = arr[i];
            }
        }
        ans.add(max);
        return ans;
        
        
        
    }
}
