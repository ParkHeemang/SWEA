package problem3314;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int[] sangol = new int[5];
			int sum = 0;

			for (int j = 0; j < 5; j++) {

				sangol[j] = sc.nextInt();
				if (sangol[j] < 40) {
					sangol[j] = 40;
				}

				sum += sangol[j];

			}

			System.out.println("#" + (i + 1) + " " + sum / 5);

		}

	}

}
