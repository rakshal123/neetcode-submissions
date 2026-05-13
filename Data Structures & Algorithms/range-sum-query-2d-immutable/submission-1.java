class NumMatrix {
    private final int[][] sumMatrix;
    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        sumMatrix = new int[rows+1][columns+1];
        for(int i=0;i<rows;i++) {
            int prefixSum = 0;
            for(int j=0;j<columns;j++) {
                prefixSum += matrix[i][j];
                int above = sumMatrix[i][j+1];
                sumMatrix[i+1][j+1] = prefixSum+above;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1 = row1+1;
        col1 = col1+1;
        row2 = row2+1;
        col2 = col2+1;
        int bottom = sumMatrix[row2][col2];
        int above = sumMatrix[row1-1][col2];
        int left = sumMatrix[row2][col1-1];
        int topLeft = sumMatrix[row1-1][col1-1];
        return bottom - left - above + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */