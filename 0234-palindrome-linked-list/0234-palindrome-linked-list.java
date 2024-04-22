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
    if(head==null){
        return true;
    }
    String st="";
    ListNode tem=head;
    while(tem!=null){
        st+=tem.val;
        tem=tem.next;
    }
    StringBuilder sb=new StringBuilder(st);
    return st.equals(sb.reverse().toString());
    }
}