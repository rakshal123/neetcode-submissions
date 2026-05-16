class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int buy = 0;
        int i=0;
        int profit = 0;
        while(i+1<n) {
            if(nums[i]<nums[i+1]) {
                buy = i;
                break;
            }
            i++;
        }
        int j = buy;
        while(j+1<n) {
            int sell = j;
            if(nums[j+1]<nums[sell]) {
                profit+=(nums[sell]-nums[buy]);
                buy = sell+1;
            }
            j++;
        }
        if(nums[j]>nums[buy]) {
            profit+=(nums[j]-nums[buy]);
        }
        return profit;
    }
}