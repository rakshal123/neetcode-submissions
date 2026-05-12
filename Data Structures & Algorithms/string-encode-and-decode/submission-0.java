class Solution {

    public String encode(List<String> strs) {
        String str = strs.stream()
        .reduce("",(str1, str2) -> str1 + str2.length() + "#" + str2);
        return str;
    }

    public List<String> decode(String s) {
        List<String> decodedString = new ArrayList<>();
        int n = s.length();
        int i=0;
        while(i<n) {
            if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9) {
                String len = "";
                while(i<n && s.charAt(i)!='#') {
                    len+=s.charAt(i);
                    i++;
                }
                Integer length = Integer.parseInt(len)+1;
                String sub = s.substring(i+1,i+length);
                decodedString.add(sub);
                i = i+length;
            } else {
                i++;
            }
        }
        return decodedString;
    }
}
