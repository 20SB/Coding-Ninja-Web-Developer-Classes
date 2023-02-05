package Lec23_Queues;

public class Queue_using_Array {
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public Queue_using_Array() {
		super();
		size = 0;
		rear = -1;
		front = -1;
		data = new int[5];
	}
	public Queue_using_Array(int capacity) {
		super();
		size = 0;
		rear = -1;
		front = -1;
		data = new int[capacity];
	}
	
	public int size() {
//		if(rear>front) size = rear-front+1;
//		else if(front>rear) size = data.length - (front-rear) +1;
//		else size = 1;
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public void enqueue (int elem) {
		if(size == data.length) {
			//Increase the size of Array
			 // or throw error
//			System.out.println("Queue is Full");
			doubleCapacity();
		}
			if(size == 0) {
				front =0;
			 }
			 rear = (rear+1) % data.length;
			 data[rear] = elem;
			 size++; 
		
		
	}
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[2*temp.length];
		int index =0;
		for(int i =front ; i<temp.length;i++) {
			data[index++] = temp[i];
		}
		for(int i =0 ; i<front;i++) {
			data[index++] = temp[i];
		}
		front =0;
		rear = temp.length-1;
//		
		
	}

	public int front() {
		if(size == 0) {
			//show queue is empty or throw error
			return -1;
		}
		else
			return data[front]; 
	}
	public int dequeue() {
		if(size == 0) {
			 //Increase the size of Array
			 // or throw error
			return -1;
		}
		else {
			int temp = data[front];
			front = (front+1) % data.length;
			size--;
			if(size==0) {
				front =-1;
				rear=-1;
			}
			return temp;
		}
	}
	
	
	
	
	
// 	MAIN FUNCTION, can be written in other class file
	
	public static void main(String[] args) {
//		System.out.println("main");
		Queue_using_Array queue = new Queue_using_Array(2);
		int arr[] = {1,2};
		for(int elem : arr) {
			queue.enqueue(elem);
//			System.out.println(queue.size());
//			System.out.println(queue.front);
//			System.out.println(queue.rear);
//			System.out.println();
		}
		queue.dequeue();
		queue.enqueue(3);
		int a[] = {4,5,6,7,8,9,10};
		for(int elem : a) {
			queue.enqueue(elem);
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
//			System.out.println(queue.size());
//			System.out.println(queue.front);
//			System.out.println(queue.rear);
//			System.out.println();
		}
	}
}

