package com.coding;

class MyQueue {

	private int[] queue;
	int front;
	int rear;
	int capacity;

	public MyQueue(int capacity) {
		this.queue = new int[capacity];
		this.capacity = capacity;
		this.front = 0;
		this.rear = 0;

	}

	// push
	public void push(int element) {
		if (isFull() == true) {
			System.out.println("queue is full");
			return;
		}
		queue[rear++] = element;
		System.out.println("inserted" + element);
	}

	// pop
	public int pop() {
		if (isEmpty() == true) {
			System.out.println("queue is empty");
			return -1;
		}
		int element = queue[front++];

		return element;
	}

	// peek
	public int peek() {
		if (isEmpty() == true) {
			System.out.println("queue is empty");
			return -1;
		}
		return queue[front];
	}

	// isfull
	public boolean isFull() {
		if (rear == capacity) {
			return true;
		} else {
			return false;
		}
	}

	// isEmpty
	public boolean isEmpty() {
		if (front == rear) {
			return true;
		} else {
			return false;
		}
	}

	// to display
	public void display() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return;
		}

		for (int i = front; i < rear; i++) {
			System.out.println(queue[i] + " ");

		}
		System.out.println();
	}

}

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q = new MyQueue(5);
		q.push(10);
		q.push(20);
		q.push(30);

		System.out.println("deleted element is" + q.pop());
		System.out.println("top element is" + q.peek());
		System.out.println("is full" + q.isFull());
		System.out.println("is empty" + q.isEmpty());
		q.display();
	}

}
