
package P0002_AddTwoNumbers;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode();
        ListNode head = l3;
        boolean carry = false;

        outerloop:
        while (true) {

            l3.val = l1.val + l2.val;

            if (carry) {
                l3.val += 1;
                carry = false;
            }

            if (l3.val >= 10) {
                l3.val -= 10;
                carry = true;
            }

            if (l1.next == null && l2.next == null) {
                if (carry) {
                    l3.next = new ListNode(1);
                }
                break outerloop;

            } else if (l1.next == null) {
                l2 = l2.next;
                l3.next = new ListNode();
                l3 = l3.next;

                while (true) {

                    l3.val = l2.val;

                    if (carry) {
                        l3.val++;
                        carry = false;
                    }

                    if (l3.val >= 10) {
                        l3.val -= 10;
                        carry = true;
                    }

                    if (l2.next == null) {
                        if (carry) {
                            l3.next = new ListNode(1);
                        }
                        break outerloop;
                    } else {
                        l2 = l2.next;
                        l3.next = new ListNode();
                        l3 = l3.next;
                    }
                }
            } else if (l2.next == null) {
                l1 = l1.next;
                l3.next = new ListNode();
                l3 = l3.next;

                while (true) {

                    l3.val = l1.val;

                    if (carry) {
                        l3.val++;
                        carry = false;
                    }

                    if (l3.val >= 10) {
                        l3.val -= 10;
                        carry = true;
                    }

                    if (l1.next == null) {
                        if (carry) {
                            l3.next = new ListNode(1);
                        }
                        break outerloop;
                    } else {
                        l1 = l1.next;
                        l3.next = new ListNode();
                        l3 = l3.next;
                    }
                }

            } else {
                l1 = l1.next;
                l2 = l2.next;
                l3.next = new ListNode();
                l3 = l3.next;
            }
        }

        return head;
    }
}
