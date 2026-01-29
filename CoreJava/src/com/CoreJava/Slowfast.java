package com.CoreJava;

public class Slowfast extends LL{

	public int atIndex(int index) {
		if(head == null) {
			System.out.println("List is empty");
			return -1;
		}
		
//		 if (index < 0 || index >= getsize) {
//		        System.out.println("Invalid index");
//		        return -1;
//		    }
//		
		
		
		
	     Node curr = head;
		for(int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr.data;
	}
	
	
	
	public static void main(String[] args) {
		LL list = new LL();
		list.addfirst(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		list.printlist();
	
	}
}
