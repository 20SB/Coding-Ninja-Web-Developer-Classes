package Test5.Replace_duplicate_values;

/******** 
Following is the structure of Linked list node
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}
*********/
import java.util.HashMap;
import java.util.Map;

public class solution {
	public static void changeLL(LinkedListNode<Integer> head) {
		// Write your code here
		Map<Integer, Integer> mymap = new HashMap<>();

		LinkedListNode<Integer> temp = head;
		int maxNum = 0;
		while (temp != null) {
			mymap.put(temp.data, (mymap.get(temp.data) == null ? 0 : mymap.get(temp.data)) + 1);
			if (maxNum < temp.data)
				maxNum = temp.data;
			temp = temp.next;
		}
		while (head != null) {
			if (mymap.get(head.data) > 1)
				mymap.put(head.data, -1);
			else if (mymap.get(head.data) == -1)
				head.data = ++maxNum;
			head = head.next;
		}
	}
}
