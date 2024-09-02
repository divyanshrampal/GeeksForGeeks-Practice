//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String A = sc.nextLine().trim();
            String B = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sameChar(A, B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int sameChar(String A, String B) 
    {
        int result = 0;
        
        int size = Math.min(A.length(), B.length());
        for(int i = 0; i < size; i++){
            if(Character.toLowerCase(A.charAt(i)) == Character.toLowerCase(B.charAt(i))){
                result++;
            }
        }
        
        return result;
    }
} 