package arrays.frogsLongestPossibleDistance;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = {2, 6, 8, 5}, nums2 = {1, 5, 5, 2, 6}, nums3 = {1, 1};
        System.out.println(solve(nums1));
        System.out.println(solve(nums2));
        System.out.println(solve(nums3));
    }

    private static int solve(int[] blocks) {
        int size = blocks.length;
        int[] arrayA = new int[size], arrayB = new int[size];
        int longestDistance = 0;
        Arrays.fill(arrayA, 1);
        Arrays.fill(arrayB, 1);
        for (int i = 1; i < size; i++) {
            if (blocks[i] <= blocks[i - 1])
                arrayA[i] = arrayA[i - 1] + 1;
        }
        for (int i = size - 2; i >= 0; i--) {
            if (blocks[i] <= blocks[i + 1])
                arrayB[i] = arrayB[i + 1] + 1;
        }
        for (int i = 0; i < size; i++) {
            longestDistance = Math.max(longestDistance, arrayA[i] + arrayB[i] - 1);
        }
        return longestDistance;
    }

}
