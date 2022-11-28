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
}