package problem1225;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 0; t < 10; t++) {

			int T = sc.nextInt();

			int[] array = new int[8];

			for (int i = 0; i < array.length; i++) {

				array[i] = sc.nextInt();

			}

			int minus = 1;

			while (true) {

				int temp = array[0];

				for (int i = 0; i < 7; i++) {

					array[i] = array[i + 1];

				}

				if (temp - minus <= 0) {

					array[7] = 0;
					break;

				} else {

					array[7] = temp - minus;
					minus++;

					if (minus == 6) {
						minus = 1;

					}
				}

			}

			System.out.print("#" + (t + 1));

			for (int i = 0; i < array.length; i++) {

				System.out.print(" " + array[i]);

			}
			System.out.println();

		}
	}

}
