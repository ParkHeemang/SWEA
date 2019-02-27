package problem1233;

import java.util.Scanner;

public class Solution { // 재귀함수를 이용한 풀이, 객체를 이용한 풀이

	static String[] tree;
	static int N;
	static String result_String;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {

			result_String = "";

			N = sc.nextInt();

			tree = new String[N + 1];

			sc.nextLine();

			for (int i = 1; i <= N; i++) {

				String line = sc.nextLine();

				String[] i_value_L_R = line.split(" ");

				tree[Integer.parseInt(i_value_L_R[0])] = i_value_L_R[1];

			}

			inorder(1);

			int result = 1;

			for (int i = 0; 2 * i + 1 < result_String.length(); i++) {

				if (!(result_String.charAt(2 * i + 1) == '+' || result_String.charAt(2 * i + 1) == '-'
						|| result_String.charAt(2 * i + 1) == '*' || result_String.charAt(2 * i + 1) == '/')) {

					result = 0;
				} else if (result_String.charAt(2 * i) == '+' || result_String.charAt(2 * i) == '-'
						|| result_String.charAt(2 * i) == '*' || result_String.charAt(2 * i) == '/') {

					result = 0;
				}

			}
			
			System.out.println("#"+t+" "+result);

		}

	}

	private static void inorder(int index) {

		if (2 * index <= N) { // 자식노드left가 있으면
			inorder(2 * index);

		}

		result_String += tree[index];

		if (2 * index + 1 <= N) {
			inorder(2 * index + 1);

			// 자식노드 right가 있으면
		}

	}

}
