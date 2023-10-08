class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0, j = 0;
        int counter =0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                counter++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return (counter==s.length())?true:false;
    }
}