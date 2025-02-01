public class Solution {
    public static int getSingleElement(int []arr){
        
        int n= arr.length;
        

        for(int i=0;i<n;i++)
        {
            int el = arr[i];
            int count = 0;

            for(int j=0;j<n;j++)
            {
                if(arr[j] == el)
                {
                    count++;

                }
            }
             if(count == 1)
            {
                return el;
            }

           
        }
        return -1;

       
    }
}