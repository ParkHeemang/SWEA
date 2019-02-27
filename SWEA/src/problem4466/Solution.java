package problem4466;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();
			int K = sc.nextInt();
			int sum = 0;

			int[] array = new int[N];

			for (int j = 0; j < array.length; j++) {

				array[j] = sc.nextInt();

			}

			Arrays.sort(array);
	

			for (int j = array.length - 1; j > array.length - 1 - K; j--) {

				sum += array[j];
			}

			System.out.println("#" + (i + 1) + " " + sum);

		}

	}

}
