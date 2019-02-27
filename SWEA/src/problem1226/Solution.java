package problem1226;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	static int[][] map = new int[16][16];
	static int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int answer;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = 10;

		for (int i = 1; i <= T; i++) {

			int tc_number = sc.nextInt();

			for (int j = 0; j < map.length; j++) {

				String line = sc.next();

				for (int k = 0; k < line.length(); k++) {

					map[j][k] = Integer.parseInt("" + line.charAt(k));

				}

			}
			
			answer = 0;
			bfs(1, 1);

//			for (int i = 0; i < map.length; i++) {
//				
//				System.out.println();
//				
//				for (int j = 0; j < map[i].length; j++) {
//					
//					System.out.print(map[i][j]);
//					
//				}
//				
//			}
			
			
			
			System.out.println("#"+i+" "+answer);

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
					break;

				} else if (map[nx][ny] == 0) {

					map[nx][ny] = 7;
					que.offer(nx);
					que.offer(ny);
				}

			}

		}

	}

}
