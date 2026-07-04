class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int min = prices[0];
        for(int num : prices){
            if(min>num){
                min = num;
            }
            else{
                int buy = num-min;
                max = Math.max(max,buy);
            }
        }
        return max;
        
    }
}
