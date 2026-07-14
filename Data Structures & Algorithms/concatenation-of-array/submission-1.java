class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int temp[] = new int[n+n];
        int k=0;
        for(int value:nums){
            temp[k++] = value;
        }
        for(int value:nums){
            temp[k++] = value;
        }
        return temp;
    }
}