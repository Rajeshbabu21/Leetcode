import java.util.*;
public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        ArrayList<Integer> number0 = new ArrayList<>();
        ArrayList<Integer> number1 = new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            if(a[i] == 0)
            {
                number0.add(a[i]);

            }

            else{
                number1.add(a[i]);
            }
        }

    for(int i=0;i<number1.size();i++)
    {
        a[i] = number1.get(i);
    }

     for(int i=number1.size();i<n;i++)
    {
        a[i]  = 0;
    }

    return a;


    }
}