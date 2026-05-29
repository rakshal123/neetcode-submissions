class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        var left = 0;
        var right = n-1;
        while(left<right) {
            int mid = left+(right-left)/2;
            if(nums[mid]<target) {
                left = mid+1;
            } else if(nums[mid]>=target) {
                right = mid;
            }
        }
        if(nums[right] < target) {
            return right+1;
        } 
        return right;
    }
}