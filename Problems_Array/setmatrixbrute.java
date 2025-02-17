class Solution {

    // Helper method to mark a row
    static void mrow(int[][] matrix, int i, int m) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    // Helper method to mark a column
    static void mcol(int[][] matrix, int j, int n) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Step 1: Mark rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {  // Corrected comparison
                    mrow(matrix, i, m);
                    mcol(matrix, j, n);
                }
            }
        }

        // Step 2: Replace all -1s with 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;  // Corrected assignment
                }
            }
        }
    }
}
