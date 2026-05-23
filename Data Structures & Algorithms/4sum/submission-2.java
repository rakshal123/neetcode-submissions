class Solution {
    List<List<Integer>> exists2Sum(int[] nums, int i, int p, long target) {
        int n = nums.length;
        int j = p + 1;
        int k = n - 1;
        List<List<Integer>> forI = new ArrayList<>();
        while (j < k) {
            if ((long)(nums[j] + nums[k]) > target) {
                k--;
            } else if ((long)(nums[j] + nums[k]) < target) {
                j++;
            } else {
                var list = new ArrayList<>(Arrays.asList(nums[i] ,nums[p], nums[j], nums[k]));
                Collections.sort(list);
                forI.add(list);
                j++;
                k--;
            }
        }
        return forI;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> utilSet = new HashSet<>();
        for(int i=0;i<n-3;i++) {
            for(int j=i+1;j<n-2;j++) {
                List<List<Integer>> values = exists2Sum(nums,i,j,(long)target-(nums[i]+nums[j]));
                utilSet.addAll(values);
            }
        }
        return utilSet.stream().toList();
    }
}