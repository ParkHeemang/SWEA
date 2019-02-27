package problem3376;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			int N = sc.nextInt();

			int[] temp = new int[N];

			for (int j = 0; j < temp.length; j++) {

				temp[j] = sc.nextInt();

			}

			Arrays.sort(temp);
			int[] array = new int[temp.length];

			for (int j = 0; j < array.length; j++) {

				array[j] = temp[temp.length - 1 - j];

			}

			int sum = 0;

			for (int j = 0; j < array.length; j++) {

				if ((j + 1) % 3 == 0)
					continue;
				else {

					sum += array[j];

				}

			}

			System.out.println("#" + t + " " + sum);

		}

	}

}
