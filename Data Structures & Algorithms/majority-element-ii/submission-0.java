class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // We are going to use Boyer-Moore Voting Algo here
        int count1=0, count2=0;
        int first = Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++) {
            if(first == nums[i]) {
                count1++;
            } else if(second == nums[i]) {
                count2++;
            } else if(count1==0) {
                first = nums[i];
                count1++;
            } else if(count2==0) {
                second = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        int threshold = (int)Math.floor(n/3);
        for(int i=0;i<n;i++) {
            if(first==nums[i]) {
                count1++;
            }
        }
        
        for(int i=0;i<n;i++) {
            if(second==nums[i]) {
                count2++;
            }
        }
        

        if(count1<=threshold && count2>threshold) {
            return List.of(second);
        } else if(count1>threshold && count2<=threshold) {
            return List.of(first);
        } else if(count1<=threshold && count2<=threshold) {
            return List.of();
        }
        return List.of(first, second);
    }
}