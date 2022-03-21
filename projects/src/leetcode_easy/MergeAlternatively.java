/*
You are given two strings word1 and word2.
Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s

Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d

Constraints:
1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
*/

public class MergeAlternatively {
    public String solutionOne(String word1, String word2) {
        String result = "";
        int evenIndex = 0;
        int oddIndex = 0;
        int minStr = Math.min(word1.length(), word2.length());
        for (int i = 0; i < minStr * 2; i++) {
            if (i % 2 == 0) {
                result += "" + word1.charAt(evenIndex);
                evenIndex++;
            } else {
                result += "" + word2.charAt(oddIndex);
                oddIndex++;
            }
        }
        if (word1.length() == word2.length())
            return result;
        int maxStr = Math.max(word1.length(), word2.length());
        int remainderStr = maxStr - minStr + result.length() - 1;
        for (int i = result.length() - 1; i < remainderStr; i++) {
            if (word1.length() > word2.length()) {
                result += "" + word1.charAt(evenIndex);
                evenIndex++;
            } else if (word2.length() > word1.length()) {
                result += "" + word2.charAt(oddIndex);
                oddIndex++;
            }
        }
        return result;
    }
}
