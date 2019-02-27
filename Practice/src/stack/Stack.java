package stack;

public class Stack {

	static int[] Stack = new int[100];
	static int top = -1;

	public static void main(String[] args) {
		
		int item;
		
		push(1);
		push(2);
		push(3);
		
		
		item = pop();
		System.out.println("pop item => "+item);
		item = pop();
		System.out.println("pop item => "+item);
		item = pop();
		System.out.println("pop item => "+item);
		
		

	}

	public static void push(int item) {

		if (top >= 99)
			return;
		else
			Stack[++top] = item;

	}

	
	public static int pop() {
		
		if(top==-1) {
			
			System.out.println("Stack is Empty");
			return 0;
		}else {
			
			return Stack[top--];
		}
	}
}
