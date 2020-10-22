package Strings.minDeletions;

import static java.lang.Integer.min;

public class Solution {

    public static int solution(String S) {

        // O(n)
        // The performance will grow linearly and in direct proportion to the size of the size of the string

        char charA = 'A';
        int numOfBs = 0, minDeletions = 0;

        for(char c : S.toCharArray()) {
            if (charA == c) {
                minDeletions = min(numOfBs, minDeletions + 1);
            }
            else {
                numOfBs++;
            }
        }

        return minDeletions;
    }

    public static void main(String[] args) {
        System.out.println(solution("BAAABAB"));
        System.out.println(solution("BBABAA"));
        System.out.println(solution("AABBBB"));
    }
}

