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
    public ListNode removeElements(ListNode head, int val) {
    if(head==null){
        return null;
    }
    ListNode result=new ListNode();
    result.next=head;
    ListNode cur=result;
    while(cur.next!=null) {
        if(cur.next.val==val) {
            cur.next=cur.next.next;
        }else{
           cur=cur.next;
        }
    }
    return result.next;
    }
}