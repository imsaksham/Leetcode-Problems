class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
		int col = board[0].length;

		for (int i = 0; i < row; i++) {
			int[] freq = new int[9];
			for (int j = 0; j < col; j++) {
				if (board[i][j] != '.') {
					freq[Integer.parseInt(String.valueOf(board[i][j])) - 1]++;
					if (freq[Integer.parseInt(String.valueOf(board[i][j])) - 1] > 1) {
						return false;
					}
				}
			}
			freq = new int[9];
			for (int k = 0; k < row; k++) {
				if (board[k][i] != '.') {
					freq[Integer.parseInt(String.valueOf(board[k][i])) - 1]++;
					if (freq[Integer.parseInt(String.valueOf(board[k][i])) - 1] > 1) {
						return false;
					}
				}
			}
		}

        for (int i = 0; i < row; i += 3) {
			for (int j = 0; j < col; j +=3) {
				int[] gridFreq = new int[9];
				for (int k = i; k < i+3; k++) {
					for (int x = j; x < j+3; x++) {
						if (board[k][x] != '.') {
							gridFreq[Integer.parseInt(String.valueOf(board[k][x])) - 1]++;
							if (gridFreq[Integer.parseInt(String.valueOf(board[k][x])) - 1] > 1) {
								return false;
							}
						}
					}
				}
			}
		}
        return true;
    }
}