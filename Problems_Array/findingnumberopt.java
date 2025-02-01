public class Solution {
    public static int missingNumber(int []a, int N) {
        // Write your code here.

        int xor1 = 0;

        int n = a.length;

        for(int i=1;i<=n;i++)
        {
            xor1 = xor1 ^ i;
        }

        int xor2 =0;
        for(int j=0;j<a.length;j++)
        {
            xor2  = xor2 ^ a[j];
        }

        return (xor1 ^  xor2);
    }
}