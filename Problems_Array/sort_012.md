class Solution {
    public void sort012(int[] arr) {
        ArrayList<Integer> zeros = new ArrayList<>();
        ArrayList<Integer> twos = new ArrayList<>();
        ArrayList<Integer> ones = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]  == 0)
            {
                zeros.add(arr[i]);
            }
            else if(arr[i] == 1)
            {
                ones.add(arr[i]);
            }
            else{
                twos.add(arr[i]);
            }
        }
        
        int index = 0;
        for(int i=0;i<zeros.size();i++)
        {
            arr[index++] = 0;
        }
        for(int i=0;i<ones.size();i++)
        {
            arr[index++] = 1;
        }
        
        for(int i=0;i<twos.size();i++)
        {
            arr[index++] = 2;
        }
        
        
        
    }
}