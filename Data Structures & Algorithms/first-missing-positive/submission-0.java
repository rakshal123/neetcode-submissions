class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // First we would mark all the negative values to zero
        for(int i=0;i<n;i++) {
            if(nums[i]<0) {
                nums[i]=0;
            }
        }

        // Second we would be iterating through the array and carry out changing for the duplicates
        for(int i=0;i<n;i++) {
            var val = Math.abs(nums[i]);
            if(!(val==0 || val>n)) {
                var temp = nums[val-1];
                if(temp == 0) {
                    nums[val-1] = -1*(n+1);
                } else {
                    if(nums[val-1]<0) {
                        continue;
                    }
                    nums[val-1] = -1*nums[val-1];
                }
            }
        }

        for(int i = 1;i<=n;i++) {
            if(nums[i-1]>=0) {
                return i;
            }
        }
        return n+1;
    }
}