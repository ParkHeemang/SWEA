package problem3142;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt(); // �� ����
			int M = sc.nextInt(); // ������

			for (int j = 0; j <= M; j++) { // �������� ��

				if (j + 2 * (M - j) == N) {

					System.out.println("#" + (i + 1) + " " + j + " " + (M - j));
				}

			}

		}

	}

}
