package Lec23_Queues;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_Collections {
	public static void main (String[] args) {
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=1;i<5;i++)
        {
            q.add(10+i);
        }
        System.out.print(q.poll()+" "+q.size());
    }
	
	
}
