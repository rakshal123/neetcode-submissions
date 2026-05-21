class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int i=0;
        int j=0;
        String ans = "";
        int flag = 0;
        while(i<n1 && j<n2) {
            if(flag==0) {
                ans+=word1.charAt(i);
                flag=1;
                i++;
            } else {
                ans+=word2.charAt(j);
                flag=0;
                j++;
            }
        }
        while(i<n1) {
            ans+=word1.charAt(i);
            i++;
        }
        while(j<n2) {
            ans+=word2.charAt(j);
            j++;
        }
        return ans;
    }
}