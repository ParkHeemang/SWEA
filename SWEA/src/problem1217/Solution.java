package problem1217;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			int T_num = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();

			System.out.println("#" + i + " " + power(N, M));

		}

	}

	public static int power(int N, int M) {

		if (M == 1)
			return N;

		return N * power(N, M - 1);

	}

}
