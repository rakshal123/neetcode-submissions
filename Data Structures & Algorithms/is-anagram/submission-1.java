class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charArray = new int[256];
        int n = s.length();
        int f = t.length();
        if(n!=f) {
            return false;
        }
        for(int i=0;i<n;i++) {
            charArray[(int) s.charAt(i)]++;
        }
        for(int i=0;i<f;i++) {
            if(charArray[(int) t.charAt(i)]==0) {
                return false;
            }
            charArray[(int) t.charAt(i)]--;
        }
        return true;
    }
}
