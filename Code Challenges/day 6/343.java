public class Solution {
    public int integerBreak(int n) {
        if (n < 4) {
            return n - 1;
        } else {
            int groupsOfThree = (n - 2) / 3;
            int remaining = n - 3 * groupsOfThree;
            return (int)Math.pow(3, groupsOfThree) * remaining;
        }
    }
}
