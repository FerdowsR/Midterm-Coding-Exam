package datastructure;

import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < 5; i++)
			q.add(i);
		System.out.println("Elements of queue " + q);

		int removedele = q.remove();
		System.out.println("removed element-" + removedele);

		System.out.println(q);

		int head = q.peek();
		System.out.println("head of queue-" + head);

		int size = q.size();
		System.out.println("Size of queue-" + size);
	}

}

