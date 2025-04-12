import java.util.ArrayList;
import java.util.List;

class Solution {
    // Method to generate Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // Generate the elements in the row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    // First and last elements in the row are always 1
                    row.add(1);
                } else {
                    // Current element is the sum of two elements directly above it
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }

            // Add the row to the triangle
            triangle.add(row);
        }

        return triangle;
    }
}