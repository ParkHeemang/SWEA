package problem5162;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] answer_list = new int[T];

		for (int i = 0; i < T; i++) {

			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();

			if (A <= B) {

				answer_list[i] = C / A;

			} else {

				answer_list[i] = C / B;

			}

		}

		for (int i = 0; i < answer_list.length; i++) {

			System.out.println("#" + (i + 1) + " " + answer_list[i]);

		}

	}

}
