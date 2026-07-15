class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head , slow = head;
        for(int i=0; i<n+1; i++){
            if(fast==null){
                head= head.next;
                return head;
            }
            fast = fast.next;
        }
        while(fast!=null){
            fast= fast.next;
            slow=slow.next;
        }
        slow.next= slow.next.next;
        return head;
    }
}