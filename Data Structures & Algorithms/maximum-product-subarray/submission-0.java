class Solution {
    public int maxProduct(int[] nums) {

        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            int mul = nums[i];
            for(int j=i+1;j<nums.length;j++){
                max = Math.max(mul,max);
                mul*=nums[j];  
            }
            max = Math.max(mul,max);
        }
        return max;
        
    }
}