package com.coding;

import java.util.Scanner;

class Node2 {
    int data;
    Node next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedListRecursion {
    Node head;

    // Insert at end
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

    // Print list normally
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Recursive reverse print
    public void printReverse(Node node) {
        if (node == null) {
            return;
        }
        printReverse(node.next);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseLinkedListRecursion list = new ReverseLinkedListRecursion();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.insertAtEnd(val);
        }

        System.out.println("Original Linked List:");
        list.printList();

        System.out.println("Linked List in Reverse (using recursion):");
        list.printReverse(list.head);

        sc.close();
    }
}
