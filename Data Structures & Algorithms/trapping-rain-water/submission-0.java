class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        right[n - 1] = -1;
        left[0] = -1;
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(nums[i - 1], left[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(nums[i + 1], right[i + 1]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if ((left[i] == -1 || right[i] == -1) || (Math.min(left[i], right[i]) < nums[i])) {
                continue;
            }
            sum += (Math.min(left[i], right[i]) - nums[i]);
        }
        return sum;
    }
}
