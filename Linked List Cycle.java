/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // If the list is empty or has only one element, there can't be a cycle.
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;      // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
            
            if (slow == fast) {
                return true; // If they meet, there is a cycle
            }
        }
        
        return false;
    }
}
