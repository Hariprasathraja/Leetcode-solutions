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
    if(head==null||head.next==null){
        return true;
    }
    ListNode tem=head;
    int[] ar=new int[100000];
    int i=0;
    while(tem!=null){
        ar[i++]=tem.val;
        tem=tem.next;
    }
    int start=0,end=i-1;
    while(start<end){
        if(ar[start++]!=ar[end--]){
            return false;
        }
    }
    return true;
    }
}