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

 //https://leetcode.com/problems/add-two-numbers/submissions/

 //Not a great solution but it did pass.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode start = answer;
        int carry = 0;
        
        while(l1 != null){
            answer.val = l1.val;
            l1 = l1.next;
            if(l1 != null){
                answer.next = new ListNode();
                answer = answer.next;
            }
        }
        answer = start;
        
        while(answer != null){
            if(l2 != null){
                answer.val += l2.val;
                l2 = l2.next;
                if(l2 != null && answer.next == null){
                    answer.next = new ListNode();
                }
            }
            answer.val += carry;
            carry = 0;
            if(answer.val >= 10){
                carry = 1;
                answer.val -= 10;
            }
            if(carry > 0 && answer.next == null){
                answer.next = new ListNode();
            }
            answer = answer.next;
        }
        
        return start;
    }
    
}