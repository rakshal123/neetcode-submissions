class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<=right) {
            int mid = left+(right-left)/2;
            if(nums[mid]==target) {
                return mid;
            }
            if(target<nums[mid]) {
                if(((nums[left]<=nums[mid]) && (target>=nums[left])) || 
                (nums[left]>nums[mid] && target<=nums[left])) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } else {
                if((nums[mid]<=nums[right] && target<=nums[right]) || (nums[mid]>nums[right] && target>nums[right])) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
