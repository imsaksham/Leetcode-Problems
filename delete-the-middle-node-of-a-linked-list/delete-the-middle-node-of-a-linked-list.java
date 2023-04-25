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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        int pos = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            pos++;
        }

        ListNode curr = head;
        for (int i = 0; i < pos-1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;
    }
}