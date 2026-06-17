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
       if(sortedString.equals(sortedString1)){
        return true;
       }
       return false;
    }
}
