package problem1227;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	static int n = 100;
	static int[][] map = new int[n][n];

	static int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int answer;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {

			int T = sc.nextInt();

			for (int i = 0; i < map.length; i++) {

				String line = sc.next();

				for (int j = 0; j < map[i].length; j++) {

					map[i][j] = Integer.parseInt("" + line.charAt(j));

				}

			}

			answer = 0;

			bfs(1, 1);

			System.out.println("#" + t + " " + answer);

		}

	}

	private static void bfs(int x, int y) {

		Queue<Integer> que = new LinkedList<Integer>();

		que.offer(x);
		que.offer(y);

		while (!que.isEmpty()) {

			int poll_x = que.poll();
			int poll_y = que.poll();

			for (int i = 0; i < direction.length; i++) {

				int nx = poll_x + direction[i][0];
				int ny = poll_y + direction[i][1];

				if (map[nx][ny] == 3) {

					answer = 1;
					return;

				} else if (map[nx][ny] == 0) {

					map[nx][ny] = 7;
					que.offer(nx);
					que.offer(ny);

				}

			}

		}

	}

}
