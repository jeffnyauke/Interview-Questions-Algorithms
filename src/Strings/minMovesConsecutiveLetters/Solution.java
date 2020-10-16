package Strings.minMovesConsecutiveLetters;

public class Solution {

    public static void main(String[] args) {
        System.out.println(minMoves("baaaaa"));
        System.out.println(minMoves("baaabbaabbbaa"));
        System.out.println(minMoves("baabab"));
    }

    public static int minMoves(String s) {
        int moves = 0;
        for (int i = 0; i < s.length(); i++) {
            int runLength = 1;
            for (; i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1); i++){
                runLength++;
            }
            moves += runLength / 3;
        }
        return moves;
    }
}
