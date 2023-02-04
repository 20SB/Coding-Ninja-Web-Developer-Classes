package Lec21_LinkList2;

import java.util.Scanner;

public class print_Reverse_In_Recursion {
	public static void print(node<Integer> head){
		if(head == null) {
			return;
		}
		print(head.next); //it is executed before printing, so that it can print from end
		System.out.print(head.data + " ");
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
