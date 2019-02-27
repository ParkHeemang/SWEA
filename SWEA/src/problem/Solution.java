package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		int[] answer_list = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int a = 0; a < answer_list.length; a++) {

			int good_room = 0;

			int width = sc.nextInt();
			int[][] field = new int[width][300];

			for (int i = 0; i < field.length; i++) {

				for (int j = 0; j < field[i].length; j++) {

					field[i][j] = 0;

				}

			}

			for (int i = 0; i < field.length; i++) {
				int height = sc.nextInt();
				for (int j = 0; j < height; j++) {
					field[i][j] = 1;

				}

			}

			for (int i = 2; i < field.length - 2; i++) {
				for (int j = 0; j < field[i].length; j++) {

					if (field[i][j] == 1 && field[i - 1][j] == 0 && field[i - 2][j] == 0 && field[i + 1][j] == 0
							&& field[i + 2][j] == 0) {

						good_room++;
					}

				}
			}

			answer_list[a] = good_room;

		}

		for (int a = 0; a < answer_list.length; a++) {

			System.out.println("#" + (a + 1) + " " + answer_list[a]);

		}

	}

}
