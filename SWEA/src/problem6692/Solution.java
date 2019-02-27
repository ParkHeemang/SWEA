package problem6692;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		double[] answer_list = new double[T];

		for (int i = 0; i < answer_list.length; i++) {

			int N = sc.nextInt();
			double sum = 0;

			for (int j = 0; j < N; j++) {

				double p = sc.nextDouble();
				int x = sc.nextInt();

				sum = sum + p * x;

			}

			answer_list[i] = sum;

		}

		for (int i = 0; i < answer_list.length; i++) {
			System.out.println("#" + (i + 1) + " " + answer_list[i]);

		}

	}

}
