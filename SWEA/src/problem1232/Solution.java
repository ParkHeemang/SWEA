package problem1232;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	static int N;
	static Node[] nodes;
	static ArrayList<String> result_arr;
	static float sum;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {

			N = sc.nextInt();

			sc.nextLine();

			result_arr = new ArrayList<String>();

			nodes = new Node[N + 1];

			for (int i = 1; i <= N; i++) { // 노드넣는 배열 생성과 노드 생성(부모자식 관계)

				String line = sc.nextLine();

				String[] input = line.split(" ");

				if (input.length == 4) {

					Node node = new Node(Integer.parseInt(input[0]), input[1]);
					node.left_child_index = Integer.parseInt(input[2]);
					node.right_child_index = Integer.parseInt(input[3]);

					nodes[Integer.parseInt(input[0])] = node;

				} else {

					Node node = new Node(Integer.parseInt(input[0]), input[1]);

					nodes[Integer.parseInt(input[0])] = node;

				}

			}

			inorder(1);

			System.out.println("#" + t + " " + nodes[1].value);

		}

	}

	private static void inorder(int i) {

		if (nodes[i].left_child_index != 0) { // 자식노드가 있으면(현재 노드는 연산자)

			inorder(nodes[i].left_child_index);
		}

		if (nodes[i].right_child_index != 0) { // 자식노드가 있으면

			inorder(nodes[i].right_child_index);
		}

		if (nodes[i].value.equals("+")) {

			nodes[i].value = Integer.parseInt(nodes[nodes[i].left_child_index].value)
					+ Integer.parseInt(nodes[nodes[i].right_child_index].value) + "";
		} else if (nodes[i].value.equals("-")) {

			nodes[i].value = Integer.parseInt(nodes[nodes[i].left_child_index].value)
					- Integer.parseInt(nodes[nodes[i].right_child_index].value) + "";
		} else if (nodes[i].value.equals("*")) {

			nodes[i].value = Integer.parseInt(nodes[nodes[i].left_child_index].value)
					* Integer.parseInt(nodes[nodes[i].right_child_index].value) + "";
		} else if (nodes[i].value.equals("/")) {

			nodes[i].value = Integer.parseInt(nodes[nodes[i].left_child_index].value)
					/ Integer.parseInt(nodes[nodes[i].right_child_index].value) + "";
		}

	}

}

class Node {

	int index;
	String value;
	int left_child_index;
	int right_child_index;

	public Node(int index, String value) {

		this.index = index;
		this.value = value;

	}
}
