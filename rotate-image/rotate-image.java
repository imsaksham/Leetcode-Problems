class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int x = 0;

        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            int k = n-1;
            for (int j = 0; j < n; j++) {
                temp[i][j] = matrix[k][i];
                k--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}