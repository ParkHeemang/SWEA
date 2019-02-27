package problem5603;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			int N = sc.nextInt();
			int[] array = new int[N];
			for (int i = 0; i < array.length; i++) {

				array[i] = sc.nextInt();

			}

			int count = 0;

			while (true) {

				int max = 0;
				int max_index = -1;

				int min = 10001;
				int min_index = -1;

				for (int i = 0; i < array.length; i++) {

					if (max < array[i]) {
						max = array[i];
						max_index = i;
					}

					if (min > array[i]) {
						min = array[i];
						min_index = i;
					}

				}

				if (max != min) {
					array[max_index]--;
					array[min_index]++;
					count++;

				} else {

					break;
				}

			}

			System.out.println("#" + t + " " + count);

		}

	}

}
