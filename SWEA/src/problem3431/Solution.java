package problem3431;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int min = sc.nextInt();
			int max = sc.nextInt();
			int current = sc.nextInt();

			int result;

			if (current > max) {

				result = -1;
			} else if (current < min) {

				result = min - current;
			} else {
				result = 0;
			}

			System.out.println("#" + (i + 1) + " " + result);
		}

	}

}
