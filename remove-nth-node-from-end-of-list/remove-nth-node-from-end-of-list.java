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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode curr = head;
        int len = 0;

        while (curr != null) {
            curr = curr.next;
            len++;
        }

        if (len == n) {
            head = head.next;
        }
        else {
            int pos = len - n;
            ListNode start = head;

            for (int i = 0; i < pos-1; i++) {
                start = start.next;
            }
            start.next = start.next.next;
        }

        return head;
    }
}