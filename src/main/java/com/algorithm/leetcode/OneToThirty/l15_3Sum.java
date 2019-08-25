package com.algorithm.leetcode.OneToThirty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: algorithmOfLeetcode
 * @description: Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 *               Find all unique triplets in the array which gives the sum of zero.
 *               Note:
 *               The solution set must not contain duplicate triplets.
 *               Example:
 *               Given array nums = [-1, 0, 1, 2, -1, -4],
 *               A solution set is:
 *               [
 *               [-1, 0, 1],
 *               [-1, -1, 2]
 *               ]
 * @author: TracyChan
 * @create: 2019/08/25 12:56
 **/
public class l15_3Sum {

    public static void main(String[] args) {
        l15_3Sum l15_3Sum = new l15_3Sum();
        System.out.println(l15_3Sum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        while (left < right) {

            for (int i = left + 1; i < right; i++) {
                int target = -(nums[left] + nums[right]);
                if (nums[i] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(target);
                    resList.add(list);
                } else if (nums[i] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return resList;
    }
}
