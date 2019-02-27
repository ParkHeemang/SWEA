package problem1219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_answer {

	static int path[][] = new int[100][2];
	static boolean check[] = new boolean[100];
	static int ans;

	static void dfs(int point, boolean first) {

		if (!first && point == 0) // 처음이 아닌데 시작점으로 가면
			return; 

		if (check[point])		//이미 간길이면
			return;

		if (path[point][0] == 99 || path[point][1] == 99) {	//도착지에 갔으면
			ans = 1;
			return;

		}

		check[point] = true;
		dfs(path[point][0], false);
		dfs(path[point][1], false);

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int test = 1; test <= 10; test++) {

			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[1]);

			String s2[] = br.readLine().split(" ");

			for (int i = 0; i < s2.length; i += 2) {
				int j = Integer.parseInt(s2[i]);
				int k = Integer.parseInt(s2[i + 1]);
				check[j] = false;

				if (path[j][0] != 0) { // 첫번쨰 순서쌍의 값이 있으면
					path[j][1] = k;
				} else {
					path[j][0] = k; // 없으면
				}

			}

			ans = 0;
			dfs(0, true);
			System.out.println("#" + test + " " + ans);

			for (int i = 0; i < path.length; i++) {
				path[i][0] = 0;
				path[i][1] = 0;

			}

		}

	}

}
