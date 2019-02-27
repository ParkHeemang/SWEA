package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		
		
		
		que.offer("a");
		que.offer("b");
		que.offer("c");
		
		System.out.println(que);	
		System.out.println(que.element());
		System.out.println(que.poll());
		
		

	}

}
