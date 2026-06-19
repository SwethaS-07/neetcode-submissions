class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;
        int max = 0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int h = Math.min(heights[i], heights[j]);
                int w = j - i;
                if(h * w > max){
                    max = h * w;
                }
            }
        }
        return max;
        
    }
}