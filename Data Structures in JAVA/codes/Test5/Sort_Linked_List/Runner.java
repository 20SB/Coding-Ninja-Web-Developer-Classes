package Test5.Sort_Linked_List;

import java.util.Scanner;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class Runner {
	public static LinkedListNode<Integer> takeInput(Scanner s) {
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		
		int data = s.nextInt();
		
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void printList(LinkedListNode<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		
		// System.out.println("null");
		System.out.println();
		return;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		LinkedListNode<Integer> head = takeInput(s);
		s.close();

		printList(Solution.sort(head));

	}
}
