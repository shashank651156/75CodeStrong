class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> charToStr = new HashMap<Character,String>();
        HashMap<String,Character> strToChar = new HashMap<String,Character>();

        int strLen = pattern.length();
        String[] sArr = s.split(" ");
        int sArrLen = sArr.length;
        if(strLen != sArrLen)
        {
            return false;
        }
        for(int i=0;i<sArrLen;i++){
           if(charToStr.containsKey(pattern.charAt(i)))
           {
               if(!charToStr.get(pattern.charAt(i)).equals(sArr[i])){
                    return false;
               }
               if(strToChar.get(sArr[i]) != pattern.charAt(i))
               {
                   return false;
               }
           }
            else{
                   charToStr.put(pattern.charAt(i),sArr[i]);
                   if(strToChar.containsKey(sArr[i]))
                   return false;
                   else
                   strToChar.put(sArr[i],pattern.charAt(i));
               }
        }

        return true;
    }
}