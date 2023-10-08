class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int temp = 0;
        int count=0;
        if(s.length()!=words.size())return false;
        else{
            for(String i: words){
                if(s.charAt(temp)==i.charAt(0)){
                    count++;
                    temp++;
                }
                else return false;
            }
        }
        return true;
    }
}