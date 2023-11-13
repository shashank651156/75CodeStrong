public class Solution {
    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] charArray = s.toCharArray();

        while (i < j) {
            while (i < j && !isVowel(charArray[i])) {
                i++;
            }

            while (i < j && !isVowel(charArray[j])) {
                j--;
            }

            if (i < j) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }
        }

        return new String(charArray);
    }
}