package problem1961;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();

			int[][] array = new int[N][N];

			for (int j = 0; j < array.length; j++) {

				for (int j2 = 0; j2 < array.length; j2++) {

					array[j][j2] = sc.nextInt();

				}

			}

			// 90도 돌려버리기
			int[][] array90 = new int[N][N];
			int[][] array180 = new int[N][N];
			int[][] array270 = new int[N][N];

			for (int j = 0; j < array.length; j++) {
				for (int j2 = 0; j2 < array.length; j2++) {

					array90[j2][array.length - 1 - j] = array[j][j2];
					array180[array.length - 1 - j][array.length - 1 - j2] = array[j][j2];
					array270[array.length - 1 - j2][j] = array[j][j2];

				}
			}
			
			System.out.println("#"+(i+1));

			for (int j = 0; j < array.length; j++) {
				for (int j2 = 0; j2 < array.length; j2++) {
					System.out.print(array90[j][j2]);
				}

				System.out.print(" ");

				for (int j2 = 0; j2 < array.length; j2++) {

					System.out.print(array180[j][j2]);

				}
				System.out.print(" ");
				for (int j2 = 0; j2 < array.length; j2++) {

					System.out.print(array270[j][j2]);

				}

				System.out.println();
			}

		}

	}

}
