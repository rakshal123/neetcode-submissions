class Solution {
    public int majorityElement(int[] nums) {
        int k = 1;
        int maxElement = nums[0];
        for(int i = 1;i<nums.length;i++) {
            if(nums[i]==maxElement) {
                k++;
            } else {
                k--;
                if(k==0) {
                    maxElement = nums[i];
                    k = 1;
                }
            }
        }
        return maxElement;
    }
}