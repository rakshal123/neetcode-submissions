class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String commonString = strs[0];
        for(int i = 1;i<strs.length;i++) {
            int count = 0;
            String check = strs[i];
            for(int j = 0;j<Math.min(commonString.length(), check.length());j++) {
                if(commonString.charAt(j) != check.charAt(j)) {
                    break;
                }
                count++;
            }
            commonString = check.substring(0, count);
            if(commonString.isEmpty()) {
                return "";
            }
        }
        return commonString;
    }
}