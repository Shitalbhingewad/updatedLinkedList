package com.LinkedList;

public class App {
   

    public static void main(String[] args) {
       System.out.println("Hello to Linked List Practise Problem!");
        Linkedlist list = new Linkedlist();
       // list.insertNode(56);
        //list.insertNode(30);
       // list.insertNode(70);
        list.insertAtStart(70);
       // list.insertAtStart(30);
        list.insertAtStart(56);
       // list.append(56);
       //  list.append(30);
        // list.append(70);
        list.insertAtIndex(1, 30);
        list.insertAtIndex(1, 40);
        
       // list.deleteNode(0);
       // list.deleteNode(2);
        list.showLinkedList();
        
        list.searchNodeWithKey(30);
        
        list.orderedLinkedList();
        list.showLinkedList();
      
    }
}