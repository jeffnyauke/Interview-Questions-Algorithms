package arrays.arraySoldierRank;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] ranks = {3, 4, 3, 0, 2, 2, 3, 0, 0};
        System.out.println(solution(ranks));
        int[] ranks2 = {4, 2, 0};
        System.out.println(solution(ranks2));
        int[] ranks3 = {4, 4, 3, 3, 1, 0};
        System.out.println(solution(ranks3));
    }

    public static int solution(int[] ranks) {
        // write your code in Java SE 8

        // O(n)
        // The performance will grow linearly and in direct proportion to the size of the number of soldiers
        int sum = 0;
        Set<Integer> soldierRank = new HashSet<>();

        for (int rank : ranks) {
            soldierRank.add(rank);
        }

        for (int rank : ranks) {
            if (soldierRank.contains(rank + 1)) {
                sum++;
            }
        }

        return sum;
    }
}
