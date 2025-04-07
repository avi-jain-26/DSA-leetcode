class Solution {
    public boolean isPalindrome(ListNode head) {
       
       ListNode s = head;
       ListNode f = head;

       //middle
       while(f !=null && f.next!=null){
        s = s.next;
        f = f.next.next;
       }

       ListNode reversed = reverse(s);
        
        while(reversed != null){

            if(head.val!=reversed.val){
                return false;
            }
            
            head= head.next;
            reversed = reversed.next;

        }
       return true;
    }

     public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}