class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        int beforeElement = nums[0];
        for(int i=1;i<n;i++) {
            prefix[i] = prefix[i-1]*beforeElement;
            beforeElement = nums[i];
        }

        // build the suffix array
        suffix[n-1] = 1;
        int lastElement = nums[n-1];
        for(int i=n-2;i>=0;i--) {
            suffix[i] = suffix[i+1]*lastElement;
            lastElement = nums[i];
        }

        for(int i=0;i<n;i++) {
            answer[i] = prefix[i]*suffix[i];
        }
        return answer;
    }
}  
