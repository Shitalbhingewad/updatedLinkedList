package com.LinkedList;

public class Linkedlist {
	Node head;

	void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node temp;
			temp = head;
			head = node;
			head.next = temp;
		}
	}

	void insertNode(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	void append(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	 void insertAtIndex(int index, int data) {
	        Node node = new Node();
	        node.data = data;
	        node.next = null;
	        if (head == null) {
	            insertAtStart(data);
	        } else {
	            Node temp;
	            temp = head;
	            for (int i = 0; i < index - 1; i++) {
	                temp = temp.next;
	            }
	            node.next = temp.next;
	            temp.next = node;
	        }
	    }
	 
	 

	
	void showLinkedList() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);

	}
	 void deleteNode(int index) {
	        Node node;
	        Node temp;
	        temp = head;
	        if (head == null) {
	            System.out.println("NO list exists!!");
	        } else {

	            for (int i = 0; i < index - 1; i++) {
	                temp = temp.next;
	            }
	            if (index == 0) {

	                head = head.next;
	                temp = null;

	            } else {
	                node = temp.next;
	                temp.next = node.next;
	                node = null;
	            }

	        }
	 }

}
