import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false; // If the string length is odd, it can't be valid.
        }
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;  // There's no matching opening character.
                }
                char opening = stack.pop();
                if ((c == ')' && opening != '(') || (c == '}' && opening != '{') || (c == ']' && opening != '[')) {
                    return false;  // Mismatched closing character.
                }
            }
        }
        return stack.isEmpty();  // Ensure that all characters have been matched.
    }
}
