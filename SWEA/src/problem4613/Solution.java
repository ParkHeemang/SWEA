package problem4613;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] answer_list = new int[T];

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();
			int M = sc.nextInt();

			char[][] map = new char[N][M];
			ArrayList<Integer> change_color_num = new ArrayList<Integer>();

			sc.nextLine();

			for (int j = 0; j < map.length; j++) {

				String string = sc.nextLine();

				for (int j2 = 0; j2 < map[j].length; j2++) {

					map[j][j2] = string.charAt(j2);
				}
			}

			int remain_row_num = N - 3; // 6-3 = 3개라고 치면

			for (int w = 0; w <= remain_row_num; w++) {

				for (int b = 0; b <= remain_row_num; b++) {

					for (int r = 0; r <= remain_row_num; r++) {

						if (w + b + r == remain_row_num) {

							int count = 0;

							w += 1; // 각각 줄수
							b += 1;
							r += 1;

							for (int j = 0; j < w; j++) { // white

								for (int j2 = 0; j2 < map[j].length; j2++) {

									if (map[j][j2] != 'W') {

										count++;
									}

								}

							}

							for (int j = w; j < w + b; j++) { // blue

								for (int j2 = 0; j2 < map[j].length; j2++) {

									if (map[j][j2] != 'B') {

										count++;
									}

								}

							}

							for (int j = w + b; j < w + b + r; j++) { // Red

								for (int j2 = 0; j2 < map[j].length; j2++) {

									if (map[j][j2] != 'R') {

										count++;
									}

								}

							}

							change_color_num.add(count);

						}

					}

				}

			}

			Collections.sort(change_color_num);

			answer_list[i] = change_color_num.get(0);

		}

		for (int j = 0; j < answer_list.length; j++) {
			System.out.println("#" + (j + 1) + " " + answer_list[j]);
		}

	}

}
