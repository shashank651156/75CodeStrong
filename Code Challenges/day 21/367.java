class Solution {
    public boolean isPerfectSquare(int num) {
        return (Math.pow(num, 0.5)) % 1 == 0;
    }
}