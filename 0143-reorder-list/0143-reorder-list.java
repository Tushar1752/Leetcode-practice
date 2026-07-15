class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }

        int n = st.size();
        temp = head;

        for (int i = 0; i < n / 2; i++) {
            ListNode last = st.pop();

            last.next = temp.next;
            temp.next = last;

            temp = last.next;
        }

        temp.next = null;
    }
}