package com.LinkedList;

public class Queue {
    private static QueueNode rear = null, front = null;

    // insertion at the end
    public void enqueue(int item) {

        QueueNode node = new QueueNode(item);

        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }

    }
 public boolean isEmpty() {
        return rear == null && front == null;
    }

    // delete at the beginning
    public int dequeue() {
        if (front == null) {
            System.out.println("\nQueue Underflow");
            System.exit(-1);
        }

        QueueNode temp = front;
       System.out.println(temp.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return temp.data;
    }

}

}