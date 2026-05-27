class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int maxAnswer = 0;
        while (i < j) {
            maxAnswer = Math.max(maxAnswer, Math.min(nums[i], nums[j]) * (j - i));
            if(nums[i]>=nums[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxAnswer;
    }
}
