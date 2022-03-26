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
    public ListNode reverseList(ListNode head) {
        
        if(head == null){
            return null;
        }
        ListNode first =  head;
        ListNode prev = head;
        
        while(head.next != null) {
            head = head.next;
            
            ListNode temp = new ListNode(head.val, prev);
            prev = temp;
        }
        
        first.next = null;
        
        return prev;
    }
}
