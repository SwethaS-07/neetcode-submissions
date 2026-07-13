class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while(i<intervals.length){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int j=i+1;
            while(j<intervals.length && intervals[j][0]<=end){
                end = Math.max(end,intervals[j][1]);
                j++;
            }
            result.add(new ArrayList<>(List.of(start, end)));
            i=j;
        }
        int[][] ans = new int[result.size()][2];

        for (int k = 0; k < result.size(); k++) {
            ans[k][0] = result.get(k).get(0);
            ans[k][1] = result.get(k).get(1);
        }

        return ans;
        
    }
}