package com.algorithm.leetcode.OneToThirty;

import java.util.Map;

/**
 * @program: algorithmOfLeetcode
 * @description: Given a 32-bit signed integer, reverse digits of an integer.
 *               Example 1: Input: 123 Output: 321
 *               Example 2: Input: -123    Output: -321
 *               Example 3: Input: 120  Output: 21
 * @author: TracyChan
 * @create: 2019/08/24 21:14
 **/
public class l7_ReverseInteger {
    public static void main(String[] args) {
        l7_ReverseInteger l7_reverseInteger = new l7_ReverseInteger();
        System.out.println(l7_reverseInteger.reverse(1534236469));
    }

    /**
     * 需要特别注意的是：x反转之后可能超过int的最大值，需要加上逻辑判定
     * @param x
     * @return
     */
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int memory = x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && memory > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && memory < -8)) {
                return 0;
            }

            res = res * 10 + memory;
        }
        return res;
    }
}
