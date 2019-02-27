package problem5431;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();
			int K = sc.nextInt();

			boolean[] Students = new boolean[N];
			for (int j = 0; j < Students.length; j++) {// 학생배열 false로 초기화
				Students[j] = false;
			}

			for (int j = 1; j <= K; j++) { // 제출한 사람 입력받기

				Students[sc.nextInt() - 1] = true;

			}

			System.out.print("#" + (i + 1) + " ");
			for (int j = 0; j < Students.length; j++) {
				if (!Students[j]) {
					System.out.print((j + 1) + " ");

				}
			}

			System.out.println();

		}

	}

}
