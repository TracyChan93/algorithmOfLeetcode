package com.algorithm.leetcode.OneToThirty;

/**
 * @program: algorithmOfLeetcode
 * @description: Given a linked list,remove the n-th node from the end of list and return its head.
 *               Example:  Given linked list: 1->2->3->4->5, and n = 2.
 *               After removing the second node from the end, the linked list becomes 1->2->3->5.
 *               Note:  Given n will always be valid.
 * @author: TracyChan
 * @create: 2019/08/25 16:20
 **/
public class l19_RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode proListNode = head;
        int length = 0;
        while (proListNode != null) {
            length++;
            proListNode = proListNode.next;
        }
        proListNode = dummy ;
        length = length -n;
        while(length>0){
            length --;
            proListNode = proListNode.next;

        }
        proListNode.next = proListNode.next.next;
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
