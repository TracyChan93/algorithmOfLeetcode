package com.algorithm.leetcode.OneToThirty;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: algorithmOfLeetcode
 * @description: Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 *               determine if the input string is valid.
 *               An input string is valid if:  Open brackets must be closed by the same type of brackets.
 *               Open brackets must be closed in the correct order.
 *               Note that an empty string is also considered valid.
 *               Example 1:
 *               Input: "()"    Output: true
 *               Example 2:
 *               Input: "()[]{}"    Output: true
 *               Example 3:
 *               Input: "(]"    Output: false
 *               Example 4:
 *               Input: "([)]"  Output: false
 *               Example 5:
 *               Input: "{[]}"  Output: true
 * @author: TracyChan
 * @create: 2019/08/25 13:16
 **/
public class l20_ValidParentheses {
    public static void main(String[] args) {
        l20_ValidParentheses l20_validParentheses = new l20_ValidParentheses();
        System.out.println(l20_validParentheses.isValid("([)]"));
        System.out.println(l20_validParentheses.isValid("()"));
    }
    Map<Character,Character> map ;
    public l20_ValidParentheses(){
        map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char compare = s.charAt(i);
            if(map.containsKey(compare)){
                char ch = stack.empty()?'#':stack.pop();
                if(ch!=map.get(compare)){
                    return false;
                }
            }else{
                stack.push(compare);
            }
        }
        return stack.isEmpty();
    }
}
