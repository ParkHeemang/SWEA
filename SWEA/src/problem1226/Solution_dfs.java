package problem1226;

import java.util.Scanner;
import java.util.Stack;

public class Solution_dfs {

	
	static int n = 16;
	static int[][] map = new int[n][n];	
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

			dfs(1, 1, map);
			
			System.out.println("#"+i+" "+answer);

		}
	}

	private static void dfs(int x, int y, int[][] map) { // 경로(좌표), 현재위치

		int[][] map_copy = new int[n][n];

		for (int i = 0; i < direction.length; i++) {

			int nx = x + direction[i][0];
			int ny = y + direction[i][1];

			for (int j = 0; j < map_copy.length; j++) {
				for (int j2 = 0; j2 < map_copy[j].length; j2++) {

					map_copy[j][j2] = map[j][j2];
				}
			}

			if (map_copy[nx][ny] == 3) {
				answer = 1;
				return;

			}else if(map_copy[nx][ny]==0) {
				
				map_copy[x][y] = 7;
				dfs(nx,ny, map_copy);
			}
			
			
			

		}

	}

}
