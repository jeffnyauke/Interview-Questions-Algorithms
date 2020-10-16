package arrays.maxChunksToSorted;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = {2, 4, 1, 6, 5, 9, 7};
        int[] nums2 = {4, 3, 2, 6, 1};
        int[] nums3 = {2, 1, 6, 4, 3, 7};
        int[] nums4 = {1, 0, 2, 3, 4};
        System.out.println(maxChunksToSorted(nums1));
        System.out.println(maxChunksToSorted(nums2));
        System.out.println(maxChunksToSorted(nums3));
        System.out.println(maxChunksToSorted(nums4));
    }

    public static int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] rightMin = new int[n];
        rightMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(arr[i], rightMin[i + 1]);
        }

        int count = 0, max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            if (i == n - 1 || max <= rightMin[i + 1]) count++;
        }
        return count;
    }
}
