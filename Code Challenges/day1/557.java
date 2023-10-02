package day1;
class Solution {
    public String reverseWords(String s) {
        // Split the input string into words using space as the delimiter
        String[] words = s.split(" ");
        StringBuilder reversedWords = new StringBuilder();
        
        // Iterate through each word and reverse it, then append it to the result
        for (String word : words) {
            reversedWords.append(new StringBuilder(word).reverse()).append(" ");
        }
        
        // Convert the StringBuilder to a string, and trim any leading/trailing spaces
        return reversedWords.toString().trim();
    }
}