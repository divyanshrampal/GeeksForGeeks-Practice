//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String str) {
        
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
             set.add(str.charAt(i));
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        int i = 0;
        int j = 0;
        int ans = str.length();
        int n = set.size();
        
        while(i < str.length()){
            char ch = str.charAt(i);
            
            if(map.containsKey(ch)){
                int val = map.get(ch);
                map.put(ch, val + 1);
            }else{
                map.put(ch, 1);
            }
            
            
            if(map.size() == n){
                
                while(map.get(str.charAt(j)) > 1){
                    int val = map.get(str.charAt(j));
                    map.put(str.charAt(j), val - 1);
                    j++;
                }  
                
                ans = Math.min(ans, i - j + 1);
            }
            
            i++;
        }
        
        return ans;
        
    }
}