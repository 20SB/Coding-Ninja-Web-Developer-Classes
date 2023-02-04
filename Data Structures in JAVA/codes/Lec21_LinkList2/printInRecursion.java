package Lec21_LinkList2;

import java.util.Scanner;

public class printInRecursion {
	public static void print(node<Integer> head){
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
            print(head);
            t -= 1;
        }
    }
}
