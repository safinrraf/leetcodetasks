package org.safin;

public class RemoveNthFromEnd {
    /**
     * My solution
     *
     * @param head head
     * @param n    position of element to be removed
     * @return head of the LinkedList
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        ListNode third = head;
        int cnt = 0;
        while (first.next != null) {
            first = first.next;
            cnt++;
            if (cnt >= n) {
                third = third.next;
            }
            if (cnt >= n + 1) {
                second = second.next;
            }
        }
        if (n == (cnt + 1)) {
            head = head.next;
        } else {
            second.next = third.next;
        }

        return head;
    }

    /**
     * Not my solution
     *
     * @param head head
     * @param n    position of element to be removed
     * @return head of the LinkedList
     */
    public ListNode removeNthFromEndNotMy(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (n-- != 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
