package com.algorithm.leetcode.OneToThirty;

/**
 * @program: algorithmOfLeetcode
 * @description: Given n non-negative integers a1, a2, ..., an ,
 *               where each represents a point at coordinate (i, ai).
 *               n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 *               Find two lines, which together with x-axis forms a container,
 *               such that the container contains the most water.
 *
 *               Example:
 *               Input: [1,8,6,2,5,4,8,3,7] Output: 49
 * @author: TracyChan
 * @create: 2019/08/24 22:42
 **/
public class l11_ContainerWithMostWater {

    public static void main(String[] args) {
        l11_ContainerWithMostWater l11_containerWithMostWater = new l11_ContainerWithMostWater();
        System.out.println(l11_containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0; i<height.length;i++){
            for (int j = i+1 ;j<height.length;j++){
                maxArea =maxArea > (j-i)*(Math.min(height[j],height[i])) ? maxArea :(j-i)*(Math.min(height[j],height[i])) ;
            }
        }
        return maxArea;
    }
}
