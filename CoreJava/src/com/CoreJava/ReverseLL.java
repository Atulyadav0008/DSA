package com.CoreJava;



public class ReverseLL {
	int size;
	ReverseLL(){
		this. size= 0;
	}
	
	
	//Node banaya hamne
	Node head;
	 class Node{
		 int data;
		 Node next;
		 int size = 0;
		 
		 Node(int data){
			this.data = data;
			this.next = null;
			size++;
		 }
	 }
	 
	 public void addFirst(int data) {
		 Node newNode = new Node(data);
		 if(head == null) {
			 head = newNode;
			 size++;
			 return;
		 }
		 newNode.next = head;
		 head = newNode;
		 size++;
	 }
	 
	 public void printlist() {
		 if(head == null) {
			 System.out.println("Empty");
			 return;
		 }else {
			 Node curr = head;
			 while(curr!=null) {
				 System.out.print(curr.data + " --> ");
				 curr = curr.next;
			 }
			 System.out.print("null");
		 }
	 }
	 
	public void reversell() {
		Node prev = null;
		Node next = null;
		Node curr = head;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev =curr;
			curr =next;
		}
		head = prev;
	}
	
	// Find middle one 
	public int MiddleElement() {
		
		if(head == null || head.next == null ) {
			System.out.println("LL has only one node ");
			return head.data;
			
		}
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
//			fast = fast.next.next;
		}
//		return slow.data;
		while(slow.next != null) {
			System.out.println(slow.data + " --> ");
		}
		re
		
	}
	
	 public ListNode middleNode(ListNode head) {
	        if()
	    }
	
	
	
	
	public static void main(String[] args) {
		ReverseLL Rll = new ReverseLL();
		Rll.addFirst(100);
		Rll.addFirst(200);
		Rll.addFirst(300);
		Rll.addFirst(400);
//		Rll.addFirst(500);
		Rll.reversell();
		Rll.printlist();
		System.out.println(" ");
		System.out.println(Rll.MiddleElement());
//		System.out.println(" ");
//		System.out.println("Size of linkedlist " + Rll.size);
	}
}

