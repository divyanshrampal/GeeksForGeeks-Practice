//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        int[] sol = new int[4];
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z'){
                sol[0]++;
            }
            
            else if(ch >= 'a' && ch <= 'z'){
                sol[1]++;
            }
            
            else if(ch >= '0' && ch <= '9'){
                sol[2]++;
            }
            
            else{
                sol[3]++;
            }
        }
        
        return sol;
    }
}