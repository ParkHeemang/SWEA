package problem3316;

import java.util.Scanner;

public class Solution {

	static boolean[] must_attend = new boolean[4];
	static String[] attend_case; // ex) "TTFT"
	static String day_leaders;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			day_leaders = sc.next();
			attend_case = new String[day_leaders.length()];

			for (int j = 0; j < attend_case.length; j++) { // 다시 초기화 할 필요 없음
				attend_case[j] = "";

			}

			must_attend[0] = true;

			if (day_leaders.charAt(0) == 'B') {

				must_attend[1] = true;

			} else if (day_leaders.charAt(0) == 'C') {

				must_attend[2] = true;

			} else if (day_leaders.charAt(0) == 'D') {

				must_attend[3] = true;

			}

			dfs(must_attend, 0, 0);

		}

		// dfs ( 당일 의무로 참석해야되는 사람, 일수)

	}

	private static void dfs(boolean[] must_attend, int j, int i) {

		if (j == attend_case.length) {

			j = 0;
			i++;

			if (day_leaders.charAt(i) == 'A') {

				must_attend[0] = true;

			} else if (day_leaders.charAt(i) == 'B') {

				must_attend[1] = true;

			} else if (day_leaders.charAt(i) == 'C') {

				must_attend[2] = true;

			} else if (day_leaders.charAt(i) == 'D') {

				must_attend[3] = true;

			}

		} else {

			if (must_attend[j] == true) { // 일자고정 멤버 회전

				attend_case[i] += "T";
				dfs(must_attend, j + 1, i);

			} else {

				attend_case[i] += "T";
				dfs(must_attend, j + 1, i);

				attend_case[i] += "F";
				dfs(must_attend, j + 1, i);

			}

		}

	}

}
