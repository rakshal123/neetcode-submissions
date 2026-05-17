class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,1);
        int currSum = 0;
        int count = 0;
        for(int num : nums) {
            currSum += num;
            int diff = currSum-k;
            count+=prefixSumMap.getOrDefault(diff, 0);
            prefixSumMap.put(
                currSum,
                prefixSumMap.getOrDefault(currSum,0)+1
            );
        }
        return count;
    }
}