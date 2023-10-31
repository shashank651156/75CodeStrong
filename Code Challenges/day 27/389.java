class Solution {
  public char findTheDifference(String s, String t) {
    var map = new int[26];

    for (var c : t.toCharArray()) map[c - 'a']++;
    for (var c : s.toCharArray()) map[c - 'a']--;

    for (var i=0; i<26; i++)
      if (map[i] > 0)
        return (char) ('a' + i);

    return ' ';
  }
}