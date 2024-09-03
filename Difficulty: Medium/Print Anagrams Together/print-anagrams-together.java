//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    private Map<Character, Integer> createMap(String str){
        
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int val = map.get(ch);
                map.put(ch, val + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
        
        return map;
        
    }
    
    public List<List<String>> Anagrams(String[] string_list) {
        
        Map<Map<Character, Integer>, List<String>> solutionMap = new HashMap<>();
        
        for(String str : string_list){
            Map<Character, Integer> stringMap = createMap(str);
            
            if(solutionMap.containsKey(stringMap)){
                List<String> list = solutionMap.get(stringMap);
                list.add(str);
                solutionMap.put(stringMap, list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                solutionMap.put(stringMap, list);
            }
        }
        
        List<List<String>> result = new ArrayList<>();
        
        for (List<String> list : solutionMap.values()){
            result.add(list);
        } 
        
        return result;
        
    }
}
