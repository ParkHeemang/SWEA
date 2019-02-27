package problem3260;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			long A = sc.nextInt();
			long B = sc.nextInt();

			long result = A + B;

			System.out.println("#" + (i + 1) + " " + result);

		}

	}

}
