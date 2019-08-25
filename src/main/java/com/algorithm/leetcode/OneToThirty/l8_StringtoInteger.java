package com.algorithm.leetcode.OneToThirty;

/**
 * @program: algorithmOfLeetcode
 * @description: Implement atoi which converts a string to an integer.
 *               Example 1:
 *               Input: "42"    Output: 42
 *               Example 2:
 *               Input: "   -42"    Output: -42
 *               Example 3:
 *               Input: "4193 with words"   Output: 4193
 *               Example 4:
 *               Input: "words and 987"   Output: 0
 *               Example 5:
 *               Input: "-91283472332" Output: -2147483648
 * @author: TracyChan
 * @create: 2019/08/24 21:51
 **/
public class l8_StringtoInteger {

    public static void main(String[] args) {
        l8_StringtoInteger l8_stringtoInteger = new l8_StringtoInteger();
        System.out.println(l8_stringtoInteger.myAtoi("-91283472332"));
    }

    public int myAtoi(String str) {
        str = str.trim();
        char flag = '+';
        int i = 0;
        if(str.length()<1) return 0;
        if (str.charAt(i) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        double res = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            res = res * 10 +(str.charAt(i)-'0');
            i++;
        }
        if(flag=='-')
            res = - res;
        if(res >Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) res;
    }

    public int myAtoi1(String str) {
        str = str.trim();
        char flag = '+';
        int i = 0;
        if(str.length()<1) return 0;
        if(str.charAt(i)=='-'){
            flag = '-';
            i++;
        }else if (str.charAt(0) == '+') {
            i++;
        }
        double result = 0;
        while (str.length()>i && str.charAt(i)>='0' && str.charAt(i)<='9' ){
            result = result *10 + (str.charAt(i)-'0');
            i++;
        }
        if(flag=='-')
            result = - result;
        if(result>Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        if(result<Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;
        return (int)result;
    }
}
