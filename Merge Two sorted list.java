
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode mergehead;
        if(list1.val <= list2.val){
            mergehead =list1;
           mergehead.next =mergeTwoLists( list1.next,  list2);
        }
        else{
            mergehead =list2;
           mergehead.next = mergeTwoLists( list1, list2.next);
        }
        return mergehead;
    }  
}
