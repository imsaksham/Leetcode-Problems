/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prev = new ListNode(-1);
        ListNode curr = prev;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            }
            else {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            curr.next = list2;
        }
        else {
            curr.next = list1;
        }

        return prev.next;

        // ListNode l1 = list1;
        // ListNode l2 = list2;
        // ListNode prev = list1;

        // while (l1 != null && l2 != null) {
        //     if (l1.val <= l2.val) {
        //         l1 = l1.next;
        //     }
        //     else {
        //         l2.next = prev.next;
        //         prev.next = l2;
                
        //         l2 = l2.next;
        //         prev = prev.next;
        //     }
        // }
        
        // while (l2 != null) {
        //     l1.next = l2;
        //     l2 = l2.next;
        //     l1 = l1.next;
        // }

        // return list1;
    }
}