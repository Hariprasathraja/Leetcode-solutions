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
    public ListNode removeNodes(ListNode head) {
        ListNode cur=head;
        Stack<ListNode>st=new Stack<>();
        while(cur!=null){
            while(!st.isEmpty()&&st.peek().val<cur.val){
                st.pop();
            }
            st.push(cur);
            cur=cur.next;
        }
        ListNode tem=null;
        while(!st.isEmpty()){
            cur=st.pop();
            cur.next=tem;
            tem=cur;
        }
        return cur;
    }
}