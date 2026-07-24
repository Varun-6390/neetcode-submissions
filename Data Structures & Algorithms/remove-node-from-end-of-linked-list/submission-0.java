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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int N = 0;
        while(cur != null)
        {
            N++;
            cur = cur.next;
        }

        int removeidx = N - n;
        cur = head;

        if(removeidx == 0)
        {
            return head.next;
        }

        for(int i = 0; i < N-1; i++)
        {
            if(i+1 == removeidx)
            {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
