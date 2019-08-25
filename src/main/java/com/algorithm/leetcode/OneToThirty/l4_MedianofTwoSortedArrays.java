package com.algorithm.leetcode.OneToThirty;

/**
 * @program: algorithmOfLeetcode
 * @description: There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *               Find the median of the two sorted arrays.
 *               The overall run time complexity should be O(log (m+n)).
 *               You may assume nums1 and nums2 cannot be both empty.
 *
 *               Example 1:
 *               nums1 = [1, 3] nums2 = [2] The median is 2.0
 *               Example 2:
 *               nums1 = [1, 2]   nums2 = [3, 4]    The median is (2 + 3)/2 = 2.5
 *
 * @author: TracyChan
 * @create: 2019/08/24 18:52
 **/
public class l4_MedianofTwoSortedArrays {

    public static void main(String[] args) {
        l4_MedianofTwoSortedArrays l4_medianofTwoSortedArrays = new l4_MedianofTwoSortedArrays();
        System.out.println(l4_medianofTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] doubles = new double[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            doubles[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < nums1.length) {
            doubles[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            doubles[k++] = nums2[j++];
        }
        if (doubles.length % 2 == 0) return (doubles[doubles.length / 2] + doubles[(doubles.length - 1) / 2]) / 2;
        else return doubles[doubles.length / 2];
    }
}
