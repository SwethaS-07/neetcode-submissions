class Solution {
    public boolean isAnagram(String s, String t) {

        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
       char[] charArray = s.toCharArray();
Arrays.sort(charArray);
String sortedString = new String(charArray);
char[] charArray1 = t.toCharArray();
Arrays.sort(charArray1);
String sortedString1 = new String(charArray1);
        for(int i=0;i<n;i++){
            char s1 = sortedString.charAt(i);
            char t1 = sortedString1.charAt(i);
            if(s1 !=t1){
                return false;
            }
        }
        return true;
    }
}
