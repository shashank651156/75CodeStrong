// class Solution {
//     public int[] countBits(int n) {
//         int[] ans = new int[n+1];
//         for (int i = 0; i <= n; i++) {
//             ans[i] = countSetBits(i);
//         }
//         return ans;
//     }
    
//     private int countSetBits(int num) {
//         int count = 0;
//         String binaryNumber = Integer.toBinaryString(num);
//         for (int i = 0; i < binaryNumber.length(); i++) {
//             char c = binaryNumber.charAt(i);
//             if (c == '1') {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // Using the fact that for any number 'x', the number of set bits is equal to the number of set bits in 'x/2' plus 'x%2'.
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}

