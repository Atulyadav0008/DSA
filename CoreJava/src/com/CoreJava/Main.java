package com.CoreJava;

class Node {
int data;
Node next;

Node(int data) {
  this.data = data;
  this.next = null;
}
}

class node{
	int data;
	node next;
	
	node(int data){
		this.data = data;
		this.next = null;
	}
}






















class MyLinkedList {
Node head;

MyLinkedList() {
  head = null;
}
}

class mylinkedlist{
	node head;
	mylinkedlist(){
		head = null;
	}
}









class Main{

public static void printList(Node head) {
  Node temp = head;
  while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
  }
  System.out.println("null");
} 

public static void main(String[] args) {
	MyLinkedList lk = new MyLinkedList();
	lk.head = new Node(10);
	lk.head.next = new Node(30);
	lk.head.next.next = new Node(40);
	printList(lk.head);

}
}