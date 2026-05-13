class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] col = new int[9];
        int[] square = new int[9];

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(board[i][j]=='.') {
                    continue;
                }
                int val = board[i][j];

                if(
                    (rows[i] & (1<<val))>0 ||
                    (col[j] & (1<<val))>0 ||
                    (square[(i/3) * 3 + (j /3)] & (1<<val))>0
                ) {
                    return false;
                }

                rows[i] = rows[i] | (1<<val);
                col[j] = col[j] | (1<<val);
                square[(i/3)*3+(j/3)] |= (1<<val);
            }
        }
        return true;
    }
}
