package com.coding;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtNthPosition {
    Node head;

    // Insert node at given position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range.");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertAtNthPosition list = new InsertAtNthPosition();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.insertAtPosition(val, i + 1); // Insert sequentially
        }

        System.out.println("Original List:");
        list.display();

        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();
        System.out.print("Enter position to insert: ");
        int pos = sc.nextInt();

        list.insertAtPosition(val, pos);

        System.out.println("List after insertion:");
        list.display();

        sc.close();
    }
}
