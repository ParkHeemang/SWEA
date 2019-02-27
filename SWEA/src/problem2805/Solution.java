package problem2805;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();
			int middle = N / 2;

			int[][] array = new int[N][N];

			sc.nextLine();

			for (int j = 0; j < array.length; j++) {

				String input_String = sc.nextLine();

				for (int j2 = 0; j2 < array[j].length; j2++) {

					array[j][j2] = Integer.parseInt("" + input_String.charAt(j2));

				}

			}

			int start = middle;
			int end = middle;

			int sum = 0;

			for (int j = 0; j < array.length; j++) {

				for (int j2 = start; j2 <= end; j2++) {

					sum += array[j][j2];

				}

				if (j < middle) {

					start--;
					end++;

				} else {

					start++;
					end--;

				}

			}

			System.out.println("#" + (i + 1) + " " + sum);

		}

	}

}
