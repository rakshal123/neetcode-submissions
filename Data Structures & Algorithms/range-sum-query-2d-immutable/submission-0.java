class NumMatrix {
    private final List<List<Integer>> mat;
    public NumMatrix(int[][] matrix) {
        mat = new ArrayList<>();
        for (int[] m : matrix) {
            List<Integer> prefixSum = new ArrayList<>();
            for (int f : m) {
                if (prefixSum.isEmpty()) {
                    prefixSum.add(f);
                } else {
                    prefixSum.add(prefixSum.get(prefixSum.size() - 1) + f);
                }
            }
            mat.add(prefixSum);
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        Integer sum = 0;
        for (int i = row1; i <= row2; i++) {
            sum += (mat.get(i).get(col2) - (col1 == 0 ? 0 : mat.get(i).get(col1 - 1)));
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */