package problem1218;

import java.util.Scanner;

public class Solution {

	static char[] Stack;
	static int top;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int k = 1; k <= 10; k++) {			//테스트 케이스마다 반복

			int N = sc.nextInt();
			Stack = new char[N];				//문자길이의 배열 만듬
			top = -1;
			sc.nextLine();
			String input_String = sc.nextLine();	//
			int bool = 1;

		
			
			
			for (int i = 0; i < input_String.length(); i++) {

				if (input_String.charAt(i) == ')') {

					if (pop() != '(') {

						bool = 0;
						break;

					}

				} else if (input_String.charAt(i) == ']') {
					if (pop() != '[') {

						bool = 0;
						break;

					}
				} else if (input_String.charAt(i) == '}') {
					if (pop() != '{') {

						bool = 0;
						break;

					}
				} else if (input_String.charAt(i) == '>') {

					if (pop() != '<') {

						bool = 0;
						break;

					}
				} else {

					push(input_String.charAt(i));

				}

			}

			if (top != -1) {

				bool = 0;
			}

			System.out.println("#" + k + " " + bool);
		}

	}

	public static void push(char item) {

		if (top >= Stack.length - 1)
			return;
		else
			Stack[++top] = item;

	}

	public static char pop() {

		if (top == -1) {

			System.out.println("Stack is Empty");
			return 'E';
		} else {

			return Stack[top--];
		}
	}

}
