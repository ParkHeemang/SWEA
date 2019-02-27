package problem3142;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt(); // 뿔 갯수
			int M = sc.nextInt(); // 마리수

			for (int j = 0; j <= M; j++) { // 유니콘의 수

				if (j + 2 * (M - j) == N) {

					System.out.println("#" + (i + 1) + " " + j + " " + (M - j));
				}

			}

		}

	}

}
