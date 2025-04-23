class Solution {
     public static int[][] merge(int[][] arr) {
      int n = arr.length; // size of the array

        // Step 1: Sort the given intervals based on start times
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
       // Step 2: Temporary array to store merged intervals
        int[][] temp = new int[n][2];
        int index = -1; // Pointer to track the last valid interval in temp

        // Step 3: Iterate through the intervals
        for (int i = 0; i < n; i++) {
            // If no intervals are merged yet or current interval doesn't overlap
            if (index == -1 || arr[i][0] > temp[index][1]) {
                index++;
                temp[index][0] = arr[i][0]; // Add the start of the current interval
                temp[index][1] = arr[i][1]; // Add the end of the current interval
            } else {
                // If intervals overlap, merge them by updating the end time
                temp[index][1] = Math.max(temp[index][1], arr[i][1]);
            }
        }

        // Step 4: Copy merged intervals to the result array
        int[][] result = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
        }

        return result;
    }
}