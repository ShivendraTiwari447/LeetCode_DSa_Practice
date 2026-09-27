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
    public ListNode reverseKGroup(ListNode head, int k) {

        // Step 1: Calculate length
        int n = 0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Number of complete groups
        int groups = n / k;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;
        ListNode curr = head;

        // Step 2: Reverse each group
        for (int g = 0; g < groups; g++) {

            ListNode groupStart = curr;
            ListNode prev = null;

            // Reverse k nodes
            for (int i = 0; i < k; i++) {

                ListNode next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect previous group with reversed group
            prevGroup.next = prev;

            // groupStart is now the last node
            // Connect it with next group
            groupStart.next = curr;

            // Move prevGroup
            prevGroup = groupStart;
        }

        return dummy.next;
    }
}