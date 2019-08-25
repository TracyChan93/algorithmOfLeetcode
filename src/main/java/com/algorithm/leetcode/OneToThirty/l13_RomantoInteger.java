package com.algorithm.leetcode.OneToThirty;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: algorithmOfLeetcode
 * @description: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *               Example 1:
 *               Input: "III" Output: 3
 *               Example 2:
 *               nput: "IV"  Output: 4
 *               Example 3:
 *               Input: "IX"  Output: 9
 *               Example 4:
 *               Input: "LVIII" Output: 58
 *               Explanation: L = 50, V= 5, III = 3.
 *               Example 5:
 *               Input: "MCMXCIV"   Output: 1994
 *               Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * @author: TracyChan
 * @create: 2019/08/25 00:43
 **/
public class l13_RomantoInteger {
    public static void main(String[] args) {
        l13_RomantoInteger l13_romantoInteger = new l13_RomantoInteger();
        System.out.println(l13_romantoInteger.romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        int result = 0;
        if(s.length()==0) return 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        result = result + map.get(s.charAt(0));
        for(int i  = 1; i <s.length();i++){
            if(map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                result = result+map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
            }else{
                result = result+map.get(s.charAt(i));
            }
        }
        return result;
    }
}
