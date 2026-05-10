class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int f = 0;
        int r = nums.length-1;
        while(f<=r) {
            if(nums[f]==0) {
                int temp = nums[l];
                nums[l] = nums[f];
                nums[f] = temp;
                l++;
                f++;
            } else if(nums[f]==1) {
                f++;
            } else {
                int temp = nums[r];
                nums[r] = nums[f];
                nums[f] = temp;
                r--;
            }
        }
    }
}