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
    public ListNode Kgroup(ListNode temp, int k) {
        while (temp != null && k > 1) {  // Traverse exactly k nodes
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode front = null;
        while (head != null) {
            front = head.next;
            head.next = prev;
            prev = head;
            head = front;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head; // Base cases

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode kth = Kgroup(temp, k);
            if (kth == null) break; // If less than k nodes remain, do not reverse

            ListNode nextGroupHead = kth.next;
            kth.next = null; // Temporarily disconnect the next part

            ListNode reversedHead = reverse(temp); // Reverse current group

            // Connect previous part to the reversed head
            if (prev == null) {
                head = reversedHead; // First group's head becomes the new head
            } else {
                prev.next = reversedHead;
            }

            // Connect the reversed group's tail to the next group's head
            temp.next = nextGroupHead;

            // Move prev to the end of the reversed group
            prev = temp;
            temp = nextGroupHead; // Move temp to the next group
        }

        return head;
    }
}
