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
    StringBuilder sb=new StringBuilder();
    if(head==null){
        return true;
    }
    ListNode tem=head;
    while(tem!=null){
        sb.append(tem.val);
        tem=tem.next;
    }
    return sb.toString().equals(sb.reverse().toString());
    }
}