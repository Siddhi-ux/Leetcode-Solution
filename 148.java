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
    public ListNode sortList(ListNode head) {
        int c=0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            c++;
        }
        int arr[] = new int[c];
        temp = head;
        c=0;
        while(temp != null){
            arr[c++]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);
        temp=head;
        c=0;
        while(temp != null){
            temp.val = arr[c++];
            temp = temp.next;
        }
        return head;
    }
}
