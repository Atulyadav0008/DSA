package com.CoreJava;

public class LL {
	Node head;
	private int size;
	LL(){
		this.size = 0;
	}
	class Node{
		int data;
		Node next ;
		
		Node(int data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	// add element in last
	public void addlast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	
	//add last
	public void last(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// this is how we add node in initial phase
	public void addfirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	//Printing list

	public void printlist() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}
	
	public void deletefirst() {
	if(head == null) {
		System.out.print("The list is empty");
		return;
	}
	size--;
	head = head.next;	
	}
	
	public void deletelast() {
		if(head == null) {
			System.out.print("The list is empty");
			return;
		}
		
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
			
		}
		secondLast.next = null;
	}
	
	
	public int getsize() {
		return size;
	}
	
	
	
	// Main function
public static void main(String[] args)	{
	LL list = new LL();
	list.addfirst(20);
	list.addfirst(60);
	list.addfirst(80);
	list.addfirst(90);
	list.addlast(100);
	list.addlast(102);
	
	list.deletefirst();
	list.deletelast();
	
	list.printlist();
	System.out.println(list.getsize());
}
	
}












