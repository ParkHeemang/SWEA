package problem1226;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_answer {

	static int[][] map;
	static int n = 16;
	static int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new InputStreamReader(new
		// FileInputStream("src/input_miro2.txt")));

		int T = 1;
		for (int tc = 1; tc <= T; tc++) {
			int T1 = Integer.parseInt(br.readLine());
			map = new int[n][n];

			for (int i = 0; i < n; i++) {
				String x = br.readLine();
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(x.charAt(j) + "");
				}
			}

			BFS(1, 1);

			
			for (int i = 0; i < map.length; i++) {
				
				System.out.println();
				for (int j = 0; j < map[i].length; j++) {
					
					
					System.out.print(map[i][j]);
					
				}
				
				
			}
			
			
//          for (int i = 0; i < n; i++) {
//              System.out.println(Arrays.toString(map[i]));
//          }
			int answer = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] == 0) {
						answer = 0;
					}
				}
			}

			System.out.println("#" + tc + " " + answer);
		}

		br.close();
	}

	private static void BFS(int c, int r) {
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.offer(c);						//현재 x좌표 queue에 저장
		queue.offer(r);						//현재 y좌표 queue에 저장

		while (!queue.isEmpty()) {			//빈큐가 아니라면			
			int x1 = queue.poll();			
			int x2 = queue.poll();			
			for (int i = 0; i < direction.length; i++) {

				int nc = direction[i][0] + x1;
				int nr = direction[i][1] + x2;

				if (map[nc][nr] == 0) {
					map[nc][nr] = 7;
					queue.offer(nc);
					queue.offer(nr);
				}
			}
		}

	}

}
