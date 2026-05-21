class Solution {
    int searchElement(int[] numbers, int left, int target) {
        int right = numbers.length-1;
        while(left<=right) {
            int mid = left+(right-left)/2;
            if(numbers[mid]==target) {
                return mid+1;
            } else if(numbers[mid]>target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for(int i=0;i<n;i++) {
            int search = searchElement(numbers, i+1, target-numbers[i]);
            if(search!=-1) {
                return new int[]{i+1, search};
            }
        }
        return new int[2];
    }
}
