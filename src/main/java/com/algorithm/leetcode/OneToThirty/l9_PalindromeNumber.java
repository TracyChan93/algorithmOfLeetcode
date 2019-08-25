package com.algorithm.leetcode.OneToThirty;

/**
 * @program: algorithmOfLeetcode
 * @description: Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * Input: 121 Output: true
 * Example 2:
 * Input: -121    Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * Input: 10  Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * @author: TracyChan
 * @create: 2019/08/24 22:11
 **/
public class l9_PalindromeNumber {

    public static void main(String[] args) {
        l9_PalindromeNumber l9_palindromeNumber = new l9_PalindromeNumber();
        System.out.println(l9_palindromeNumber.isPalindrome(-121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        boolean res = true;
        int compare = 0;
        int x0 = x;
        while (x0 != 0) {
            int pop = x0 % 10;
            x0 = x0 / 10;
            if ((compare > Integer.MAX_VALUE / 10) || (compare == Integer.MAX_VALUE / 10 && pop > 7)) return false;
            if ((compare < Integer.MIN_VALUE / 10) || (compare == Integer.MIN_VALUE / 10 && pop < -8)) return false;
            compare = compare * 10 + pop;
        }
        if (compare != x)
            return false;
        return res;
    }
}
