class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> cons = new HashMap<>();
        int maxCount = 0;
        for(int num : nums) {
            if(cons.containsKey(num)) {
                continue;
            }
            // first the element is entrying a subsequence for that we must update it's length
            cons.put(num, cons.getOrDefault(num-1,0) +
                        cons.getOrDefault(num+1,0) +
                        1);
            // now we need to update the length of the left extreme
            cons.put(num - cons.getOrDefault(num-1, 0), cons.get(num));
            // now we need to update the right extreme
            cons.put(num+cons.getOrDefault(num+1 , 0), cons.get(num));
            maxCount = Math.max(cons.get(num), maxCount);
        }
        return maxCount;
    }
}
