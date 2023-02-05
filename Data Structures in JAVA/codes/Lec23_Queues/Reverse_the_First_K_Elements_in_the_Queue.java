/*
 * For a given queue containing all integer data, reverse the first K elements.
You have been required to make the desired change in the input queue itself.

Input Format :
The first line of input would contain two integers N and K, separated by a single space. They denote the total number of elements in the queue and the count with which the elements need to be reversed respectively.
The second line of input contains N integers separated by a single space, representing the order in which the elements are enqueued into the queue.

Output Format:
The only line of output prints the updated order in which the queue elements are dequeued, all of them separated by a single space. 
Note:
You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input queue itself.

Constraints :
1 <= N <= 10^6
1 <= K <= N
-2^31 <= data <= 2^31 - 1
 Time Limit: 1sec

Sample Input 1:
5 3
1 2 3 4 5
Sample Output 1:
3 2 1 4 5
Sample Input 2:
7 7
3 4 2 5 6 7 8
Sample Output 2:
8 7 6 5 2 4 3

 */
package Lec23_Queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Input {
	int n;
	int k;
	Queue<Integer> queue;

	public Input(int n, int k, Queue<Integer> queue) {
		this.queue = queue;
		this.n = n;
		this.k = k;
	}

}

public class Reverse_the_First_K_Elements_in_the_Queue {
	
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		//addFirst: This method is used to insert an element at the front of the Deque. This method is an equivalent of the push() method of a Stack.
		//offer: This method is used to insert an element at the end of the Queue. It returns a boolean value indicating whether the element has been successfully added to the queue or not.
		//poll: This method retrieves and removes the head of the Queue. It returns the head of the queue if the queue is not empty, otherwise, it returns null.
		//A deque, short for double-ended queue, is a data structure that allows insertion and deletion from both ends.
		
		LinkedList<Integer> temp = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			temp.addFirst(input.poll());
		}
		while (!temp.isEmpty()) {
			input.offer(temp.poll());
		}
		for (int i = 0; i < input.size() - k; i++) {
			input.offer(input.poll());
		}
		return input;
	}
	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Input takeInput() throws NumberFormatException, IOException {
    	String[] n_k = br.readLine().trim().split(" ");

    	int n = Integer.parseInt(n_k[0]);
    	int k = Integer.parseInt(n_k[1]);

    	String[] values = br.readLine().trim().split(" ");

    	Queue<Integer> queue = new LinkedList<>();

    	for (int i = 0; i < n; i++) {
    		queue.add(Integer.parseInt(values[i]));
    	}

    	return new Input(n, k, queue);

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	Input input = takeInput();

    	int n = input.n;
    	int k = input.k;
    	Queue<Integer> queue = input.queue;

    	queue = reverseKElements(queue, k);


    	while (!queue.isEmpty()) {
    		System.out.print(queue.poll() + " ");
    	}
    }
}
