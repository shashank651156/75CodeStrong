class Solution {
  public boolean winnerOfGame(String colors) {
    int n = colors.length();
    int aliceWins = 0;
    int bobWins = 0;

    // Count the number of consecutive 'A's and 'B's.
    for (int i = 1; i < n - 1; i++) {
      if (colors.charAt(i - 1) == 'A' && colors.charAt(i) == 'A' && colors.charAt(i + 1) == 'A') {
        aliceWins++;
      } else if (colors.charAt(i - 1) == 'B' && colors.charAt(i) == 'B' && colors.charAt(i + 1) == 'B') {
        bobWins++;
      }
    }

    // Alice starts, so if she has more opportunities to remove 'A', she wins.
    return aliceWins > bobWins;
  }
}