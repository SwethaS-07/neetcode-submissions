class Solution {
    public int lengthOfLastWord(String s) {

        String[] arr = s.split(" ");
        int n = arr.length;
        String s1 = arr[n-1];
        int len = s1.length();
        return len;
    }
}