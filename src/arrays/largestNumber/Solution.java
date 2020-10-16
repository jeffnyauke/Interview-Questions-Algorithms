package arrays.largestNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {3, 8, 2, 3, 3, 2};
        int[] nums2 = {7, 1, 2, 8, 2};
        int[] nums3 = {3, 1, 4, 1, 5};
        int[] nums4 = {5, 5, 5, 5, 5};
        System.out.println(largestNumber(nums1));
        System.out.println(largestNumber(nums2));
        System.out.println(largestNumber(nums3));
        System.out.println(largestNumber(nums4));
    }

    private static int largestNumber(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int key = Integer.MIN_VALUE;
        int res = 0;
        for (Map.Entry<Integer, Integer> entity : hm.entrySet()) {
            if (entity.getKey() == entity.getValue()) {
                if (key < entity.getKey()) {
                    key = entity.getKey();
                    res = entity.getValue();
                }
            }
        }
        return res;
    }
}
