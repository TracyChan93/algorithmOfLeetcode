package com.algorithm.leetcode.OneToThirty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: algorithmOfLeetcode
 * @description: Given an array nums of n integers and an integer target,
 *               find three integers in nums such that the sum is closest to target.
 *               Return the sum of the three integers.
 *               You may assume that each input would have exactly one solution.
 *               Example:  Given array nums = [-1, 2, 1, -4], and target = 1.
 *               The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * @author: TracyChan
 * @create: 2019/08/25 21:54
 **/
public class l16_3SumClosest {

//    public static void main(String[] args) {
//        l16_3SumClosest l16_3SumClosest = new l16_3SumClosest();
//        System.out.println(l16_3SumClosest.threeSumClosest(new int[]{-1, 2, 1, -4},1));
//    }
//    public int threeSumClosest(int[] nums, int target) {
//        int result = target;
//        int len = nums.length;
//        if (len < 3) {
//            return 0;
//        }
//        Arrays.sort(nums);
//        for (int i = 0; i < len-2; i++) {
//            int number = nums[i];
//
//            int leftIndex = i + 1;
//            int rightIndex = len - 1;
//            while (leftIndex < rightIndex) {
//                int threeSum = number + nums[leftIndex] + nums[rightIndex];
//                if (threeSum == target) {
//                    return target;
//                } else {
//                    if (result == target || Math.abs(target - threeSum) < Math.abs(target - result)) {
//                        result = threeSum;
//                    }
//                    if (threeSum < target) {
//                        while (leftIndex < rightIndex && nums[leftIndex++] == nums[leftIndex] ) {
//
//                        }
//                    } else {
//                        while (leftIndex < rightIndex && nums[rightIndex--] == nums[rightIndex ]) {
//
//                        }
//                    }
//                }
//            }
//        }
//        return result;
//    }
}
