/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int n1 = 0, n2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        // Get the length of list A
        while (temp1 != null) {
            n1++;
            temp1 = temp1.next;
        }

        // Get the length of list B
        while (temp2 != null) {
            n2++;
            temp2 = temp2.next;
        }

        // Align the pointers of both lists to the same starting point
        temp1 = headA;
        temp2 = headB;

        int resA = n1 - n2;
        int resB = n2 - n1;

        // Move the pointer of the longer list ahead by the length difference
        if (resA > 0) {
            while (resA > 0) {
                temp1 = temp1.next;
                resA--;
            }
        } 
        else  {
            while (resB > 0) {
                temp2 = temp2.next;
                resB--;
            }
        }

        // Traverse both lists and find the intersection
        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // Return null if no intersection is found
        return null;
    }
}
