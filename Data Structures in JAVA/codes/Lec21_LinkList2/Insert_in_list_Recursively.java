package Lec21_LinkList2;

import java.util.Scanner;

public class Insert_in_list_Recursively {	
	public static node<Integer> Insert(node<Integer> head, int num, int pos){
		if(head == null && pos>0) {
			return head;
		}
		if(pos == 0) {
			node<Integer> newNode = new node<Integer> (num);
			newNode.next = head;
			return newNode;
		}
		else {
			node<Integer> smallNode = Insert(head.next, num, pos-1);
			head.next = smallNode;
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
            int num = s.nextInt();
            int pos = s.nextInt();
            head = Insert(head, num, pos);
            print(head);
            t -= 1;
        }
    }
}
