class Solution {

    private boolean willWork(int[] weights, int days, int weightInOneDay) {
        int sum = weightInOneDay;
        for(int i : weights) {
            if(i > sum) {
                days--;
                sum = weightInOneDay;
            }
            if(days == 0 || i > weightInOneDay) {
                return false;
            }
            sum = sum - i;
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int maxWeight = 0;

        int leastWeight = 1;
        for(int i : weights) {
            leastWeight = Math.max(leastWeight,i);
            maxWeight+=i;
        }
        int maxWeightInOneDay = leastWeight;
        while(leastWeight<=maxWeight) {
            int mid = (leastWeight + maxWeight) / 2;
            if(willWork(weights, days, mid)) {
                maxWeight = mid-1;
                maxWeightInOneDay = mid;
            } else {
                leastWeight = mid+1;
            }
        }
        return maxWeightInOneDay;
    }
}