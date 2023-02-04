/*
 * Given a singly linked list of integers, sort it using 'Bubble Sort.'
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.

Input format :
The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element

Output format :
For each test case/query, print the elements of the sorted singly linked list.
Output for every test case will be printed in a seperate line.

Constraints :
0 <= M <= 10^3
Where M is the size of the singly linked list.
Time Limit: 1sec

Sample Input 1 :
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10 
 Sample Input 2 :
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90 
 */
package Lec21_Linked_List_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bubble_Sort_Iterative_LinkedList {
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		//Your code goes here
		LinkedListNode<Integer> temp =head, p = head, c, f;
		int count=0;
		while(temp!=null){
			count++;
			temp = temp.next;
		}
		for(int i = 0; i<count-1 ;i++){
			temp =head;
			System.out.println();
			for(int j=0;j<count-i-1 ;j++){
				
				c=temp;
				f=temp.next;
				if(temp.data >temp.next.data){
					if(temp == head){
						c.next = f.next;
						f.next = c;
						head = f;
						temp =f;
					}
					else{
						p.next = f;
						c.next = f.next;
						f.next = c;
						temp = f;;
					}
				}
				p = temp;
				temp=temp.next;
			}
		}
		return head;
	}
	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
    	LinkedListNode<Integer> head = takeInput(); 

    	head =bubbleSort(head);
    	print(head);
    }
}
