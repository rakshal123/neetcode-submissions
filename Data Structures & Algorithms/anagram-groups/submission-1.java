class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String a : strs) {
            int[] freq = new int[26];
            for(char ch : a.toCharArray()) {
                freq[ch - 'a']++;
            }

            String f = Arrays.toString(freq);
            map.putIfAbsent(f, new ArrayList<String>());
            map.get(f).add(a);
        }
        return new ArrayList<>(map.values());
    }
}
