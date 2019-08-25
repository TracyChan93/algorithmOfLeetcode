package com.algorithm.leetcode.OneToThirty;

/**
 * @program: algorithmOfLeetcode
 * @description: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *               Example 1:
 *               Input: 3   Output: "III"
 *               Example 2:
 *               Input: 4 Output: "IV"
 *               Example 3:
 *               Input: 9 Output: "IX"
 *               Example 4:
 *               Input: 58  Output: "LVIII"
 *               Explanation: L = 50, V = 5, III = 3.
 *               Example 5:
 *               Input: 1994    Output: "MCMXCIV"
 *               Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * @author: TracyChan
 * @create: 2019/08/24 22:49
 **/
public class l12_IntegertoRoman {

    public static void main(String[] args) {
        l12_IntegertoRoman l12_integertoRoman = new l12_IntegertoRoman();
        System.out.println(l12_integertoRoman.intToRoman(1994));
        System.out.println(l12_integertoRoman.intToRomanBetter(1994));
    }
    public String intToRoman(int num) {
        String[] I = {"","I","II" ,"III" ,"IV" ,"V" ,"VI", "VII" ,"VIII","IX"};
        String[] X = {"","X","XX" ,"XXX"  ,"XL" ,"L", "LX" ,"LXX","LXXX","XC"};
        String[] C = {"","C","CC" ,"CCC" ,"CD" ,"D" ,"DC", "DCC" ,"DCCC","CM"};
        String[] M = {"","M","MM" ,"MMM" };
        return M[num/1000]+C[num%1000/100]+X[num%100/10]+I[num%10];
    }
    public String intToRomanBetter(int num) {
        int[] nArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        for(int i =0;i<rArray.length;i++){
            while(num>=nArray[i]){
                result= result+rArray[i];
                num=num-nArray[i];
            }
        }
        return result;
    }
}
