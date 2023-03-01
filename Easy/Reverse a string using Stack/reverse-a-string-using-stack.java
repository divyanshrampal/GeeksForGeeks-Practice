//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            stack.push(ch);
        }
        
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }

}