package com.algorithm.leetcode.OneToThirty;

/**
 * @program: algorithmOfLeetcode
 * @description: You are given two non-empty linked lists representing two non-negative integers.
 *               The digits are stored in reverse order and each of their nodes contain a single digit.
 *               Add the two numbers and return it as a linked list.
 *               You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *               Example:
 *               Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *               Output: 7 -> 0 -> 8
 *               Explanation: 342 + 465 = 807.
 *
 * @author: TracyChan
 * @create: 2019/08/24 12:35
 **/
public class l2_AddTwoNumbers {

    public static void main(String[] args) {
        l2_AddTwoNumbers l2_addTwoNumbers = new l2_AddTwoNumbers();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        ListNode pro = dummy;
        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            pro.next = new ListNode(sum % 10);
            pro = pro.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry != 0)
            pro.next = new ListNode(carry);
        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

}
