class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int p = 0;
        int q = 0;
        for(int i=0;i<n;i++) {
            int sum = target - nums[i];
            p = i;
            for(int j = i+1;j<n;j++) {
                if(sum == nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }
}
