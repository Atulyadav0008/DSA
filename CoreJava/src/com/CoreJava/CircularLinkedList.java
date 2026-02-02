package com.CoreJava;

public class CircularLinkedList {

    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at last (circular way)
    public void addLast(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            newNode.next = head;   // point to itself
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = head;
    }

    // Print circular linked list safely
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);

        System.out.println("(back to head)");
    }

    //My function
    public Node startCycle() {
    	
    	
    	if(head == null ||  head.next == null) {
    		return null;
    	}
    	
    	Node fast = head;
    	Node slow = head;
    	
    	while(fast!=null && fast.next!=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		
    		if(fast == slow) {
    			slow = head;
    			
    			while(fast != slow) {
    				slow = slow.next;
    				fast = fast.next;
    			}
    			return slow;
    		}
    	}
    	return null;

    }
    
    
    
    
    // Main method
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();

        cl.addLast(3);
        cl.addLast(2);
        cl.addLast(0);
        cl.addLast(-4);

        cl.printList();
        Node res = (Node) cl.startCycle();
        System.out.println(res.data);
    }
}
