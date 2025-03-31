//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int R = Integer.parseInt(read.readLine());
            int C = Integer.parseInt(read.readLine());
            int matrix[][] = new int[R][C];
            int c = 0;
            for (int i = 0; i < R; i++) {
                String line[] = read.readLine().trim().split(" ");
                for (int j = 0; j < C; j++) {
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
     int median(int matrix[][]) {
         int m = matrix.length , n = matrix[0].length;
        List<Integer> lst = new ArrayList<>();

        // Traverse the matrix and
        // copy the elements to the list:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                lst.add(matrix[i][j]);
            }
        }

        // Sort the list:
        Collections.sort(lst);
        return lst.get((m * n) / 2);
    }
}