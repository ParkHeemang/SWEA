package problem1860;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt(); // 사람수
			int M = sc.nextInt(); // 몇초애
			int K = sc.nextInt(); // 몇개씩 만드는지

			int[] sonnim_at_time = new int[11112];
			for (int j = 0; j < sonnim_at_time.length; j++) {

				sonnim_at_time[j] = 0;

			}

			for (int j = 0; j < N; j++) {

				sonnim_at_time[sc.nextInt()]++;

			}

			boolean possible = true;

			int sum = 0;

			for (int j = 0; j < sonnim_at_time.length; j++) {

				if (j % M == 0 && j != 0) {
					sum += K;

				}

				sum -= sonnim_at_time[j];

				if (sum < 0) {

					possible = false;
					break;
				}

			}
			System.out.println("#" + (i + 1) + " " + (possible ? "Possible" : "Impossible"));
		}

	}
}
