package problem2819;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

	static int[][] map;
	static HashSet<String> hash;
	static Integer[][] next = { { 0, 0, 1, -1 }, { 1, -1, 0, 0 } };

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		map = new int[4][4];
		for (int i = 1; i <= T; i++) {
			hash = new HashSet<String>();
			for (int j = 0; j < map.length; j++) { // ют╥б
				for (int j2 = 0; j2 < map.length; j2++) {
					map[j][j2] = sc.nextInt();
				}
			}
			for (int j = 0; j < map.length; j++) {
				for (int j2 = 0; j2 < map.length; j2++) {
					find_case(j, j2, String.valueOf(map[j][j2]), 1);
				}
			}
			System.out.println("#"+(i)+" "+hash.size());
		}
	}

	public static void find_case(int x, int y, String num_case, int depth) {
		if (depth == 7) {
			hash.add(num_case);
			return;
		}

		for (int i = 0; i < 4; i++) {																					
			int nx = x + next[0][i];
			int ny = y + next[1][i];

			if (nx >= 0 && nx < 4 && ny >= 0 && ny < 4) {						
				find_case(nx, ny, num_case + map[nx][ny], depth+1);
			}
		}
	}
}
