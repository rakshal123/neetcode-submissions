class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k==0) return;

        for(int i=0;i<gcd(n,k);i++) {
            int prev = nums[i];
            int current = i;
            
            do {
                int next = (current+k)%n;
                int temp = nums[next];
                nums[next] = prev;

                prev = temp;
                current = next;
            } while(current!=i);
        }
    }
    private int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
}