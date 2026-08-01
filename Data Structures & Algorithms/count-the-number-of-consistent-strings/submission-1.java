
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Step 1: Store allowed characters in a HashSet for O(1) lookups
        HashSet<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        
        int count = 0;
        
        // Step 2: Check each word
        for (String word : words) {
            boolean isConsistent = true;
            
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break; // Stop checking this word immediately
                }
            }
            
            if (isConsistent) {
                count++;
            }
        }
        
        return count;
    }
}
