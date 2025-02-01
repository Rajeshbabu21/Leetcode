//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;




// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        
        ArrayList<Integer> number = new ArrayList<>();
        
        Map<Integer,Integer> map = new HashMap<>();
        
        int n1 = a.length;
        int n2 = b.length;
        
        for(int i=0;i<n1;i++)
        {
            map.put(a[i],1);
        }
        
        for(int i=0;i<n2;i++)
        {
            if(map.containsKey(b[i]))
            {
                
            }
            else{
                map.put(b[i],1);
            }
        }
        
        number.addAll(map.keySet());
        Collections.sort(number);
        
        return number;
    }
}
