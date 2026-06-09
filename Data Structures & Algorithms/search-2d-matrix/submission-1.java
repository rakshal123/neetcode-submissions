class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; //number of rows
        int n = matrix[0].length; //number of columnns
        //Find the nearest row
        int nearestRow = 0;
        {
            int l = 0;
            int r = m-1;
            while(l<=r) {
                int mid = (l+r)/2;
                if(matrix[mid][0]<=target) {
                    if(matrix[mid][0]==target) {
                        return true;
                    }
                    nearestRow = mid;
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            }
        }
    
        int l = 0;
        int r = n-1;
        while(l<=r) {
            int mid = (l+r)/2;
            if(matrix[nearestRow][mid]==target) {
                return true;
            } else if(matrix[nearestRow][mid] < target) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return false;
    }
}
