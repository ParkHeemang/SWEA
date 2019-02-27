package problem6913;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			int max = 0;
			int max_count = 0;

			int N = sc.nextInt(); // 사람 수
			int M = sc.nextInt(); // 문제수

			int[][] array = new int[N][M];

			for (int i = 0; i < array.length; i++) {

				for (int j = 0; j < array[i].length; j++) {

					array[i][j] = sc.nextInt();
				}

			}

			for (int i = 0; i < array.length; i++) {

				int sum = 0;

				for (int j = 0; j < array[i].length; j++) {

					sum += array[i][j];

				}

				if (sum > max) {

					max = sum;
					max_count = 1;

				} else if (sum == max) {

					max_count++;

				}

			}

			System.out.println("#" + t + " " + max_count + " " + max);

		}

	}

}
