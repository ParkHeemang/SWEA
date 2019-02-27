package problem2819;

import java.util.HashSet;
import java.util.Scanner;

public class answer1 {

	static Integer[][] next = { { 0, 0, 1, -1 }, { 1, -1, 0, 0 } };
	static HashSet<String> hs;
	static int[][] map;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		map = new int[4][4];
		for (int test_case = 1; test_case <= T; test_case++) {
			hs = new HashSet<String>();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					findSet(i, j, 0, String.valueOf(map[i][j]));
				}
			}

			System.out.println("#" + test_case + " " + hs.size());
		}
	}

	static void findSet(int x, int y, int depth, String s) {
		if (depth == 6) {
			hs.add(s);
			return;
		}

		for (int i = 0; i < 4; i++) {
			int vx = x + next[0][i];
			int vy = y + next[1][i];
			if (vx >= 0 && vx < 4 && vy >= 0 && vy < 4) {
				findSet(vx, vy, depth + 1, String.valueOf(map[vx][vy]) + s);
			}
		}
	}
}