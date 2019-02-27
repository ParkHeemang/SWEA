package treeNodeTest;

import java.util.Scanner;

public class Solution { // 재귀함수를 이용한 풀이, 객체를 이용한 풀이

	static String[] tree;
	static int N;
	static String result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {

			result = "";

			N = sc.nextInt();

			tree = new String[N + 1];

			sc.nextLine();

			for (int i = 1; i <= N; i++) {

				String line = sc.nextLine();

				String[] i_value_L_R = line.split(" ");

				tree[Integer.parseInt(i_value_L_R[0])] = i_value_L_R[1];

			}

			

			inorder(1);
			
			System.out.println("#"+t+" "+result);

		}

	}

	private static void inorder(int index) {

		if (2 * index <= N) { // 자식노드left가 있으면
			inorder(2*index);

		}

		result += tree[index];

		if (2 * index + 1 <= N) {
			inorder(2*index+1);

			// 자식노드 right가 있으면
		}

	}

}
