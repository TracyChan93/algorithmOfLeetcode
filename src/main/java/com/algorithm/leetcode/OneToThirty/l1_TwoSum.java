package com.algorithm.leetcode.OneToThirty;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: algorithmOfLeetcode
 * @description: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *               You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *               example:
 *               Given nums = [2, 7, 11, 15], target = 9,
 *               Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * @author: TracyChan
 * @create: 2019/08/24 12:22
 **/
public class l1_TwoSum {

    public static void main(String[] args) {
        l1_TwoSum one_twoSum = new l1_TwoSum();
        int[] in =one_twoSum.twoSum(new int[]{2, 7, 11, 15},9);
        for (int i:in) {
            System.out.println(i);
        }
        System.out.println(one_twoSum.twoSum(new int[]{2, 7, 11, 15},9));
    }

    Map<Integer,Integer> valueMap = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ;i < nums.length ;i++){
            int num = target - nums[i];
            if(valueMap.containsKey(num))
                return new int[]{valueMap.get(num),i};
            else
                valueMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
