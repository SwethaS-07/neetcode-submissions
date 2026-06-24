class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] output = new int[n];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int mul =1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                mul*=nums[j];
            }
            output[k++] = mul;
        }
        return output;
    }
}  
