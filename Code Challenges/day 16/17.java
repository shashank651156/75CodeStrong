class Solution {
    private Map<Character, String> digitToLetters = new HashMap<>();
    private List <String> resultList = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0){
            return resultList;
        }
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        generatePossibilities(digits, 0, new StringBuilder());
        return resultList;
    }

    private void generatePossibilities(String digits, int currIdx, StringBuilder currPossibility){
        if(currIdx == digits.length()){
            resultList.add(currPossibility.toString());
            return;
        }
        char currentDigit = digits.charAt(currIdx);
        String letterOptions = digitToLetters.get(currentDigit);

        if (letterOptions != null) {
            for (int i = 0; i < letterOptions.length(); i++) {
                char letter = letterOptions.charAt(i);
                currPossibility.append(letter);
                generatePossibilities(digits, currIdx +1, currPossibility);
                currPossibility.deleteCharAt(currPossibility.length() - 1);
            }
        }
    }
}