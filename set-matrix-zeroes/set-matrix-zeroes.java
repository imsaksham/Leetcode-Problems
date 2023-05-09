class Solution {
    public void setZeroes(int[][] matrix) {
        // Optimal Solution
        int row = matrix.length;
        int col = matrix[0].length;

        Boolean firstRowZero = false;
        Boolean firstColZero = false;

        // check if first row needs to be changed to zero
        for (int j = 0; j < col; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // check if first col needs to be changed to zero
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // mark the row col which have zero in first row and col
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // fill in the zeroes
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // update first row
        if (firstRowZero) {
            for (int j = 0; j < col; j++) {
                matrix[0][j] = 0;
            }
        }

        // update first col
        if (firstColZero) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // Better Solution

    //     int[] row = new int[matrix.length];
    //     int[] column = new int[matrix[0].length];

    //     Arrays.fill(row, 0);
    //     Arrays.fill(column, 0);

    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (matrix[i][j] == 0) {
    //                 row[i] = 1;
    //                 column[j] = 1;
    //             }
    //         }
    //     }

    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (row[i] == 1 || column[j] == 1) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }

    // Brute force solution

    // public static void makeRowZero(int i, int[][] matrix) {
    //     for (int j = 0; j < matrix[0].length; j++) {
    //         if (matrix[i][j] != 0) {
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }

    // public static void makeColZero(int j, int[][] matrix) {
    //     for (int i = 0; i < matrix.length; i++) {
    //         if (matrix[i][j] != 0) {
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }

    // public void setZeroes(int[][] matrix) {
    //     int row = matrix.length;
    //     int column = matrix[0].length;

    //     for (int i = 0; i < row; i++) {
    //         for (int j = 0; j < column; j++) {
    //             if (matrix[i][j] == 0) {
    //                 makeRowZero(i, matrix);
    //                 makeColZero(j, matrix);
    //             }
    //         }
    //     }

    //     for (int i = 0; i < row; i++) {
    //         for (int j = 0; j < column; j++) {
    //             if (matrix[i][j] == - 1) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }
}