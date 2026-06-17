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
    public int numComponents(ListNode head, int[] nums) {
       Set<Integer> set=new HashSet<Integer>();
        for(int n:nums) set.add(n);
        ListNode curr=head;
        int res=set.size();
        while(curr.next!=null){
            if(set.contains(curr.val)&&set.contains(curr.next.val)) res--;
            curr=curr.next;
        }
        return res;
    }
}