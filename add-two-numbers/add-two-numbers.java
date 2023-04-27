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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            List<Integer> list = new ArrayList<>();

            ListNode l3 = new ListNode(0);
            ListNode curr = l3;
            int rem;
            int carry = 0;

            while (l1 != null || l2 != null) {
                int sum = 0;
                if (l1 != null) {
                    sum += l1.val;
                }
                if (l2 != null) {
                    sum += l2.val;
                }
                sum += carry;
                rem = sum % 10;
                curr.next = new ListNode(rem);
                carry = sum / 10;

                curr = curr.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }

            return l3.next;
    }
}