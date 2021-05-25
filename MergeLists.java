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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head;
        
        if(l1 == null && l2 == null) return null;
        if(l2 == null) return l1;
        if(l1 == null) return l2;
        
        if(l1.val <= l2.val){
            head = l1;
        } else {
            head = l2;
        }
        ListNode headCache = head;
        
        while(l1 != null && l2 != null){
            ListNode temp = null;
            if(l1.val <= l2.val){
                temp = l1;
                l1 = l1.next;
            } else {
                temp = l2;
                l2 = l2.next;
            }
            head.next = temp;
            head = temp;
        }
        if (l1 != null){
            head.next = l1;
        } else if(l2 != null){
            head.next = l2;
        }
        return headCache;
    }
}