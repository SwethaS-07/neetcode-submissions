

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert map to list
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Step 3: Sort by frequency (descending)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Step 4: Store first k elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}