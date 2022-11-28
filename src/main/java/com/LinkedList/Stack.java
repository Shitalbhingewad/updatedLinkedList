package com.LinkedList;



public class Stack {
   
     private Node top;

    public Stack() {
        this.top = null;
    }

    // insert at start of List
    public void push(int x) {
        Node node = new Node();
        node.data = x;
        node.next = top;
        top = node;
    }

    // check stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // print nodes of list
    void showStack() {

        Node temp = top;
        if (isEmpty()) {
           System.out.println("Stack is empty");
        } else {
            while (temp.next != null) {
            	 System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
 public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return top.data;
    }

    // function to pop a top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
        int top = peek();
        this.top = (this.top).next;
        return top;
    }
}