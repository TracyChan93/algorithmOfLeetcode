package com.algorithm.leetcode.OneToThirty;

/**
 * @program: algorithmOfLeetcode
 * @description: Write a function to find the longest common prefix string amongst an array of strings.
 *               If there is no common prefix, return an empty string "".
 *               Example 1:
 *               Input: ["flower","flow","flight"]  Output: "fl"
 *               Example 2:
 *               Input: ["dog","racecar","car"] Output: ""
 *               Explanation: There is no common prefix among the input strings.
 * @author: TracyChan
 * @create: 2019/08/25 12:32
 **/
public class l14_LongestCommonPrefix {

    public static void main(String[] args) {
        l14_LongestCommonPrefix l14_longestCommonPrefix = new l14_LongestCommonPrefix();
        System.out.println(l14_longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        if (strs.length < 1) return sb.toString();
        if (strs.length == 1) return strs[0];
        int minStrLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minStrLength = minStrLength < str.length() ? minStrLength : str.length();
        }
        boolean flag = false;
        for (int i = 0; i < minStrLength; i++) { //第几个字符
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) { //第几个串
                if(ch == strs[j].charAt(i)){

                }else{
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            sb.append(ch);

        }
        return sb.toString();
    }
}
