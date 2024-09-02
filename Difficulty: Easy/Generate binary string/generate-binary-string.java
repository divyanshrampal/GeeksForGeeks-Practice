//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> res  = ob.generate_binary_string(s);
            for(int i = 0; i < res.size(); i++)
            {
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    
    private void helper(StringBuilder input, int idx, List<String> ans){
        
        if(idx == input.length()){
            ans.add(input.toString());
            return;
        }
        
        if(input.charAt(idx) == '?'){
            input.setCharAt(idx, '0');
            helper(input, idx + 1, ans);
            
            input.setCharAt(idx, '1');
            helper(input, idx + 1, ans);
            
            input.setCharAt(idx, '?');
        }
        else{
            helper(input, idx + 1, ans);
        }
        
    }
    
    public List<String> generate_binary_string(String s)
    {
        List<String> ans = new ArrayList<String>();
        
        
        helper(new StringBuilder(s), 0, ans);
        
        return ans;
        
    }
}