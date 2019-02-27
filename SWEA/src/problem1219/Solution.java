package problem1219;

import java.util.Scanner;

public class Solution {

	static int[][] path = new int[100][2]; // 값이 0으로 초기화
	static boolean[] check = new boolean[100]; // false로 초기화
	static int answer;

	public static void dfs(int point, boolean first) {

		// 시작점 0과 배열의 0의 의미가 다르므로 함수를 끝낸다
		if (point == 0 && first != true) {
			return;
		}
		// 이미 간길일때 함수를 끝낸다
		if (check[point]) {
			return;
		}
		// 도착점에 도착해도 함수를 끝낸다.
		if (point == 99) {
			answer = 1;
			return;
		}

		dfs(path[point][0], false);
		dfs(path[point][1], false);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {

			sc.nextInt();
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {

				int from_point = sc.nextInt();
				int to_point = sc.nextInt();

				if (path[from_point][0] != 0) {
					path[from_point][1] = to_point;
				} else {
					path[from_point][0] = to_point;
				}

				answer = 0;
				dfs(0, true);

			}

			for (int i = 0; i < path.length; i++) {

				path[i][0] = 0;
				path[i][1] = 0;

			}

			System.out.println("#" + t + " " + answer);

		}

	}

}
