class Solution {
    private boolean isValid(int[] piles,int k, int h) {
        int sumOfHrsToEat = 0;
        for(int i=0;i<piles.length;i++) {
            sumOfHrsToEat+=(Math.ceil((double)piles[i]/k));
        } 
        return sumOfHrsToEat<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length; 
        var validK = piles[n-1];
        int l = 1;
        int r = piles[n-1];
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(isValid(piles, mid, h)) {
                validK = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return validK;
    }
}
