class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        if (k == 0)
            return;

        int d = n - k;

        int gcd = gcd(n, d);

        for (int i = 0; i < gcd; i++) {

            int temp = nums[i];
            int j = i;

            while (true) {

                int next = (j + d) % n;

                if (next == i)
                    break;

                nums[j] = nums[next];
                j = next;
            }

            nums[j] = temp;
        }
    }

    private int gcd(int a, int b) {

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }
}