package Lec21_LinkList2;

import java.util.Scanner;

public class Delete_node_Recursively {
	public static node<Integer> deleteNodeRec(node<Integer> head, int pos) {
    	//Your code goes here
        if(head == null && pos >=0){
            return head;
        }
        else if(pos == 0){
            return head.next;
        }
        else{
            node<Integer> SmallNode = deleteNodeRec(head.next, pos-1);
            head.next = SmallNode;
            return head;
        }
	}
	
	public static void print(node<Integer> head){	//Output Function
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		print(head.next);
	}
	static Scanner s = new Scanner(System.in);
	public static node<Integer> takeInput(){	//Input Function
        node<Integer> head = null, tail = null;
        int data = s.nextInt();
        while(data != -1) {
            node<Integer> newNode = new node<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void main(String[] args){	//Main Function
    	int t = s.nextInt();
        while (t > 0) {
            node<Integer> head = takeInput(); 
            int pos = s.nextInt();
            head = deleteNodeRec(head, pos);
            print(head);
            t -= 1;
        }
    }
}
