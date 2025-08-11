package com.coding;

import java.util.Scanner;

class Node1 {
    int data;
    Node next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNthNode {
    Node head;

    // Insert at the end (for initial list creation)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete N-th node
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If head needs to be removed
        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If position is invalid
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    // Display linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNthNode list = new DeleteNthNode();
        Scanner sc = new Scanner(System.in);

        // Create initial list
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("Initial List:");
        list.display();

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        list.deleteAtPosition(pos);

        System.out.println("List after deletion:");
        list.display();
    }
}
