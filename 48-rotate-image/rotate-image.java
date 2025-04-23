class Solution {
    /**
     * Rotates the given matrix 90 degrees clockwise in-place.
     * 1. Transpose the matrix (swap rows with columns).
     * 2. Reverse each row to achieve the final rotated matrix.
     */
    static void rotate(int[][] matrix) {
        // Step 1: Transpose the matrix (swap rows and columns).
        // Loop through each cell in the upper triangular part of the matrix (i.e., above the diagonal).
        for (int i = 0; i < matrix.length; i++) { // Iterate over rows.
            for (int j = i; j < matrix[0].length; j++) { // Iterate over columns, starting from the diagonal (j >= i).
                // Transpose operation:
                int temp = 0; // Temporary variable to store matrix[i][j].
                temp = matrix[i][j]; // Store the value at position (i, j).
                matrix[i][j] = matrix[j][i]; // Replace (i, j) with the value at position (j, i).
                matrix[j][i] = temp; // Place the stored value from (i, j) into position (j, i).
            }
        }

        // Step 2: Reverse each row in the transposed matrix.
        for (int i = 0; i < matrix.length; i++) { // Iterate over each row.
            for (int j = 0; j < matrix.length / 2; j++) { // Iterate only until the middle column of the row.
                // Swap the elements in the row to reverse its order.
                // Swap matrix[i][j] with matrix[i][matrix.length - 1 - j].
                int temp = 0; // Temporary variable to store matrix[i][j].
                temp = matrix[i][j]; // Store the value at position (i, j).
                matrix[i][j] = matrix[i][matrix.length - 1 - j]; // Replace (i, j) with the value from the end of the row.
                matrix[i][matrix.length - 1 - j] = temp; // Place the stored value into the end of the row.
            }
        }
    }
}