class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer>  mp = new HashMap<>();
        int size = 0;
        for(int i : nums) {
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(n+1);
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            list.get(entry.getValue()).add(entry.getKey());
        }
        int[] answer = new int[k];
        int index = 0;
        for (int i = n; i > 0; i--) {
            for (int val : list.get(i)) {
                answer[index++] = val;
                if (index == k) return answer;
            }
        }
        return answer;
    }
}
