class Solution {
    public int appendCharacters(String s, String t) {
        int i=0, j=0;
        int m = s.length();
        int answer = t.length();
        int n = answer;
        while(i<m&&j<n){
            if(t.charAt(j)==s.charAt(i)){
                i++;
                j++;
                answer--;
            }
            else {
                i++;
            }

        }
        return answer;
    }
}