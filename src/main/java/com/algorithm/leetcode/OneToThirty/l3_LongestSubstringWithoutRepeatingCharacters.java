package com.algorithm.leetcode.OneToThirty;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: algorithmOfLeetcode
 * @description: Given a string, find the length of the longest substring without repeating characters.
 *               Example 1:
 *               Input: "abcabcbb"  Output: 3
 *               Explanation: The answer is "abc", with the length of 3.
 *
 *               Example 2:
 *               Input: "bbbbb" Output: 1
 *               Explanation: The answer is "b", with the length of 1.
 *
 *               Example 3:
 *               Input: "pwwkew"    Output: 3
 *               Explanation: The answer is "wke", with the length of 3.
 *               Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * @author: TracyChan
 * @create: 2019/08/24 19:07
 **/
public class l3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        l3_LongestSubstringWithoutRepeatingCharacters l3_longestSubstringWithoutRepeatingCharacters = new l3_LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l3_longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }

    /**
     * 巧妙的运用了队列的先进先出特性
     * 需要注意：
     * offer，add 区别：
     * 一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，多出的项就会被拒绝。
     * 这时新的 offer 方法就可以起作用了。它不是对调用 add() 方法抛出一个 unchecked 异常，而只是得到由 offer() 返回的 false。
     *
     * poll，remove 区别：
     * remove() 和 poll() 方法都是从队列中删除第一个元素。remove() 的行为与 Collection 接口的版本相似， 但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况。
     *
     * peek，element区别：
     * element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null。
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int reMax = 0;
        Queue<Character> queue = new LinkedList<>();
        for(int i =0;i<s.length();i++){
           char ch = s.charAt(i);
            if(!queue.contains(ch)){
                queue.add(ch);
            }else{
                while (true){
                    if(ch==queue.peek()){
                        queue.poll();
                        break;
                    }
                    else
                        queue.poll();
                }
                queue.add(ch);

            }
            reMax = reMax > queue.size() ? reMax : queue.size();
        }

        return reMax;
    }
}
