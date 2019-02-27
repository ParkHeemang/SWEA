package problem6808;

import java.util.Scanner;

public class Solution {

	static int[] gyuyoung;
	static int win_sum;
	static int lose_sum;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			gyuyoung = new int[9];
			boolean[] remain = new boolean[18];
			for (int j = 0; j < remain.length; j++) {
				remain[j] = true;
			}

			for (int j = 0; j < 9; j++) {
				int a = sc.nextInt();
				gyuyoung[j] = a;
				remain[a - 1] = false;
			}

			int[] inyoung = new int[9];
			int k = 0;
			for (int j = 0; j < remain.length; j++) {
				if (remain[j]) {
					inyoung[k] = j + 1;
					k++;
				}

			}

			win_sum = 0;
			lose_sum = 0;

			int[] history_list = new int[9];

			dfs(inyoung, 0, history_list);

			System.out.println("#" + (i + 1) + " " + win_sum + " " + lose_sum);

		}

	}

	private static void dfs(int[] cards, int i, int[] history_list) {

		if (i == 9) {

			int gyuyoung_win_sum = 0;
			int inyoung_win_sum = 0;

			for (int j = 0; j < history_list.length; j++) {

				if (gyuyoung[j] > history_list[j]) {

					gyuyoung_win_sum += (gyuyoung[j] + history_list[j]);
				} else if (gyuyoung[j] < history_list[j]) {
					inyoung_win_sum += (gyuyoung[j] + history_list[j]);
				}

			}

			if (gyuyoung_win_sum > inyoung_win_sum) { // ÃÑÁ¡ ºñ±³

				win_sum++;

			} else if (gyuyoung_win_sum < inyoung_win_sum) {

				lose_sum++;
			}

			return;

		}

		for (int j = 0; j < cards.length; j++) {
			if (cards[j] != 0) {

				int[] copy = new int[9];
				int[] copy2 = new int[9];
				for (int j2 = 0; j2 < cards.length; j2++) {
					copy[j2] = cards[j2];
					copy2[j2] = history_list[j2];
				}

				int temp = cards[j];

				copy2[i] = cards[j];
				copy[j] = 0;

				dfs(copy, i + 1, copy2);

			}

		}

	}

}
