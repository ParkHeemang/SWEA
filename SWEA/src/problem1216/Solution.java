package problem1216;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			int max = 0;

			int T = sc.nextInt();

			int[][] array = new int[100][100];

			for (int j = 0; j < array.length; j++) {

				String input = sc.next();

				for (int j2 = 0; j2 < array[j].length; j2++) {

					array[j][j2] = input.charAt(j2);

				}

			}

			for (int j = 0; j < array.length; j++) { // 행반복
				for (int j2 = 0; j2 < array.length; j2++) { // 시작하는 char
					for (int k = j2; k < array.length; k++) { // 끝나는 char
						boolean flag = true;
						for (int l = 0; l < (k - j2 + 1) / 2; l++) {
							if (array[j][j2 + l] != array[j][k - l]) {
								flag = false;
							}
						}

						if (flag) {

							if (max < (k - j2 + 1)) {

								max = k - j2 + 1;

							}
						}

					}

				}
			}

			for (int j = 0; j < array.length; j++) { // 행반복
				for (int j2 = 0; j2 < array.length; j2++) { // 시작하는 char
					for (int k = j2; k < array.length; k++) { // 끝나는 char
						boolean flag = true;
						for (int l = 0; l < (k - j2 + 1) / 2; l++) {
							if (array[j2 + l][j] != array[k - l][j]) {
								flag = false;
							}
						}

						if (flag) {

							if (max < (k - j2 + 1)) {

								max = k - j2 + 1;

							}
						}

					}

				}
			}

			System.out.println("#" + i + " " + max);

		}

	}

}
