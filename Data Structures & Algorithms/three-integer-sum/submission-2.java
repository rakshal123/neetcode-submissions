class Solution {
    List<List<Integer>> exists2Sum(int[] nums, int i, int target) {
        int n = nums.length;
        int j = i+1;
        int k = n-1;
        List<List<Integer>> forI = new ArrayList<>();
        while(j<k) {
            if(nums[j]+nums[k]>target) {
                k--;
            } else if(nums[j]+nums[k]<target) {
                j++;
            } else {
                forI.add(List.of(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }
        }
        return forI;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0;
        HashSet<List<Integer>> answer = new HashSet<>();
        while(i<n-2) {
            List<List<Integer>> answerList = exists2Sum(nums,i,-1*nums[i]);
            if(answerList!=null) {
                answer.addAll(answerList);
            }
            i++;
        }
        return answer.stream().toList();
    }
}
