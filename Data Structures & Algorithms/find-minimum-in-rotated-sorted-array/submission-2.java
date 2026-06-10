class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int minElement = 1001;
        while(left<=right) {
            int mid = left+(right-left)/2;
            if(nums[left] <= nums[mid]) {
                // left half is sorted
                minElement = Math.min(minElement, nums[left]);
                left = mid+1;
            } else {
                // right half is sorted
                minElement = Math.min(minElement, nums[mid]);
                right = mid-1;
            }
        }
        return minElement;
    }
}
