class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var answer = new ArrayList<List<String>>();
        Arrays.sort(strs);
        for(String s : strs) {
            boolean f = false;
            String p = s;
            for(List<String> a : answer) {
                char[] charSeq1 = a.get(0).toCharArray();
                char[] charSeq2 = p.toCharArray();
                Arrays.sort(charSeq1);
                Arrays.sort(charSeq2);
                if(Arrays.equals(charSeq1, charSeq2)) {
                    a.add(s);
                    f=true;
                    break;
                }
            };
            if(!f) {
                answer.add(new ArrayList<>(List.of(s)));
            }
        }
        return answer;
    }
}
