package com.coding;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class DeleteNthNodeSLL {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		// Create a dummy node to simplify edge cases (like deleting the head)
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		// First and second pointers
		ListNode first = dummy;
		ListNode second = dummy;

		// Move first pointer n+1 steps ahead to create gap
		for (int i = 0; i <= n; i++) {
			first = first.next;
		}

		// Move both pointers until first reaches end
		while (first != null) {
			first = first.next;
			second = second.next;
		}

		// Skip the target node
		second.next = second.next.next;

		return dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create linked list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		DeleteNthNodeSLL obj = new DeleteNthNodeSLL();

		int n = 2; // delete 2nd node from end
		head = obj.removeNthFromEnd(head, n);

		// Print updated list
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
	}

}
