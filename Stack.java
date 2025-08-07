package com.coding;

class MyStack {
	private int[] stack;
	private int top;
	private int capacity;

	public MyStack(int capacity) {
		this.stack = new int[capacity];
		this.top = -1;
		this.capacity = capacity;
	}

	// push
	public void push(int element) {
		if (top == capacity - 1) {
			System.out.println("stack overflow");
			return;
		}
		stack[++top] = element;
		System.out.println("successfully inserted");
	}

	// pop
	public int pop() {
		if (isEmpty() == true) {
			System.out.println("stack underflow");
			return -1;
		}
		int element = stack[top--];
		return element;
	}

	// peek
	public int peek() {
		if (isEmpty() == true) {
			System.out.println("stack underflow");
			return -1;
		}
		return stack[top];
	}

	// isEmpty
	public boolean isEmpty() {
		return top == -1;
	}

	// isFull
	public boolean isFull() {
		return top == capacity - 1;
	}

	// display
	public void display() {
		if (isEmpty() == true) {
			System.out.println("stack underflow");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.println(stack[i]);
			}
			System.out.println();
		}
	}

}

public class Stack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack s = new MyStack(3);
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("deleted element is" + s.pop());
		System.out.println("top element is" + s.peek());
		System.out.println("is empty: " + s.isEmpty());
		System.out.println("is full: " + s.isFull());
		System.out.print("elements are: ");
		s.display();
	}
}
