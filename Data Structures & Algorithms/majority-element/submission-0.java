class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = 0;
        int value = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                value = entry.getKey();
            }
        }
        return value;

        
    }
}