//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution { 
     public int longestUniqueSubstr(String s) { 
     int n = s.length(); 
     int[] ans = new int[26]; 
     int count = 1;
     int i = 0; 
     int j = 0; 
     while(j < n){
     ans[s.charAt(j)-'a']++; 
     while(ans[s.charAt(j)-'a'] > 1 && i < j){ 
     ans[s.charAt(i)-'a']--; i++; 
     }
     count = Math.max(count,j-i+1); 
     j++; 
        } 
return count; 
    }
 }