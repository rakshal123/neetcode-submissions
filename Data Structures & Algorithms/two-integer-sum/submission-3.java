class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        var r = new int[2];
        try {
            for(int i=0;i<nums.length;i++) {
                int diff = target - nums[i];
                if(map.containsKey(diff)) {
                    r[0] = map.get(diff);
                    r[1] = i;
                } else {
                    map.put(nums[i] , i);
                }
            }
            return r;
        }
        finally {
            System.gc();
        }
    }
}
