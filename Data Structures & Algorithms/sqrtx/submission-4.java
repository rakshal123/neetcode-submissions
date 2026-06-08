class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int l = 1;
        int r = x/2;
        int realAns = 1;
        while(l<=r) {
            int mid = l+(r-l)/2;
            int ans = x/mid;
            if(mid <= ans) {
                realAns = mid;
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return realAns;
    }
}