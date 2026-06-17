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
    public boolean isPalindrome(ListNode head) {
        ListNode first=head;
        ListNode second=head;
        ListNode temp=null;
        ListNode prev=null;
        while(first!=null&&first.next!=null){
            second=second.next;
            first=first.next.next;
        }
        prev=second;
        second=second.next;
        prev.next=null;

        while(second!=null){
            temp=second.next;
            second.next=prev;
            prev=second;
            second=temp;
        }
        first=head;
        second=prev;
        while(second!=null){
            if(first.val!=second.val) return false;
            first=first.next;
            second=second.next;
        }
        return true;
    
    }
}