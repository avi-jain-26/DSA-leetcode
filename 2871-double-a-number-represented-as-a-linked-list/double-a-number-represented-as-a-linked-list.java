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
    public ListNode doubleIt(ListNode head) {

        head = reverse(head);
        ListNode temp = head; 
        ListNode temp2 = new ListNode(-1);
        ListNode ans = temp2;
        int c=0;

        while(temp!=null){

           int tot = (temp.val * 2) + c;
           c= tot/10;
           ans.next = new ListNode(tot%10);
           ans = ans.next;
           temp = temp.next;
        }

        if(c!=0){
           ans.next = new ListNode(c);
        }
        
        return reverse(temp2.next);

    }
    
   public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev= current;
            current = next;
        }

        return prev;
   }
}