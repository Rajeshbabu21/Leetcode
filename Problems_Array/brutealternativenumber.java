import java.util.*;
public class Solution {
    public static int[] alternateNumbers(int []a) {
        
    ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        int n = a.length;

        for(int i=0;i<n;i++)
        {
            if(a[i] < 0)
            {
                odd.add(a[i]);
            }
            else{
                even.add(a[i]);
            }
        }

        int p = 0;
        int neg = 0;

        for(int i=0;i<n;i++)
        {
            if(i%2 ==0)
            {
                a[i] = even.get(p);
                p++;
            }

            else{
                a[i] = odd.get(neg);
                neg++;
            }
        }

        return a;


    }
}