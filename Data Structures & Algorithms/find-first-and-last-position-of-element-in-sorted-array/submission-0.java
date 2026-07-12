class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] ans = {-1, -1};

        // First occurrence
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans[0] = i;
                break;
            }
        }

        // Last occurrence
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}