package com.CoreJava;

//import com.CoreJava.LL.Node;

public class Duplicate_handle {
	
	public static int countDuplicate(int[] arr) {
		int n = arr.length;
		int duplicate = 0;
		if(n == 0) {
			return -1;
		}
		for(int i = 1; i<n; i++) {
			if(arr[i] == arr[i-1]) {
				duplicate++;
			}
		}
		return duplicate;
	}
	
	// Remove duplicate using 2 pointers
	public int removeDuplicate(int[] arr) {
		int n = arr.length;
		int replacer = 0;
		int checker = 1;
		int res = 1;
		if(n == 0) {
			return -1;
		}
		while(checker < n ) {
			if(arr[checker] == arr[checker - 1]) {
				checker++;
				continue;
			}
			arr[replacer + 1] = arr[checker];
			checker++;
			replacer++;
			res ++;
		}
		return res; // dekho yahan chahe ham replacer + 1 ko return kar de ya fir res ko baat
		// ek hi rahegi.
		
	}
	
	public void printArray(int[] arr, int res) {
		int n = arr.length;
		if(n == 0) {
			System.out.println("Empty array.");
		}else {
			for(int i = 0 ; i< res; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	
	// count the total dupliacate node in linkedkist.
	
	Node head;
	class Node{
		int data;
		Node next ;
		
		Node(int data){
			this.data = data;
			this.next = null;
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
	
	public int dupNode() {
		int duplicate = 0;
		Node curr = head;
		while(curr!= null && curr.next != null) {
			if(curr.data == curr.next.data) {
				duplicate ++;
				curr = curr.next;
			}
			curr = curr.next;
		}
		return duplicate;
	}
	
	// Deleting duplicate node in linkedlist
	public Node deleteDupNode() {
		if(head == null) {
		 return head;
		}
		Node curr = head;
		while(curr != null && curr.next != null) {
			if(curr.data == curr.next.data) {
				curr.next = curr.next.next;
			}else {
			curr = curr.next;
		}
		}
		return head;
	}
	
	
	
	
	
	
	
		public static void main(String[] args) {
			Duplicate_handle dup = new Duplicate_handle();
//		int arr[] = {1,1,1,2,3,4,5,5};
//		int res = dup.removeDuplicate(arr);
		
//		System.out.println(res);
//		dup.printArray(arr, res);
		
		dup.addlast(1);
		dup.addlast(2);
		dup.addlast(2);
		dup.addlast(4);
		dup.addlast(4);
		dup.printlist();
		dup.deleteDupNode();
		dup.printlist();
	}
}
