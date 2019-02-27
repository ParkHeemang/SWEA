package problem1209;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			int T = sc.nextInt();

			int max = 0;

			int[][] array = new int[100][100];

			for (int j = 0; j < array.length; j++) {

				for (int j2 = 0; j2 < array[j].length; j2++) {

					array[j][j2] = sc.nextInt();

				}

			}

			for (int j = 0; j < array.length; j++) {

				int garo = 0;

				for (int j2 = 0; j2 < array[j].length; j2++) {

					garo += array[j][j2];

				}

				if (garo > max) {

					max = garo;
				}

			}

			for (int j = 0; j < array.length; j++) {

				int sero = 0;

				for (int j2 = 0; j2 < array[j].length; j2++) {

					sero += array[j2][j];

				}

				if (sero > max) {

					max = sero;
				}

			}

			int degag = 0;
			for (int j = 0; j < array.length; j++) {

				degag += array[j][j];

			}

			if (degag > max) {

				max = degag;

			}

			System.out.println("#" + i + " " + max);

		}

	}

}
