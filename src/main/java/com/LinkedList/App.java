package com.LinkedList;



public class App {
	

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(70);
		s.push(30);
		s.push(56);
		s.showStack();
		 while (!s.isEmpty()) {
            s.peek();
            s.pop();
        }
		 
	}
}
