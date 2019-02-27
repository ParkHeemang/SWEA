package problem1486;

import java.util.Scanner;

public class Solution {

	static int N;
	static int B;
	static int min;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			N = sc.nextInt(); // 점원수
			B = sc.nextInt(); // 높이
			min = B;

			int[] array = new int[N];

			for (int j = 0; j < array.length; j++) {

				array[j] = sc.nextInt();

			}

			dfs(0, array, 0);

			System.out.println("#" + (t + 1) + " " + min);

		}

	}

	private static void dfs(int sum, int[] array, int i) { // sum 이번 인자를 더할 것인가 나눠주는 변수

		if (sum >= B) { // 탑의 높이가 선반 높이 이상일 경우

			if (min > sum - B) {

				min = sum - B;

			}

		}

		if (i == array.length) {

			return;

		}

		dfs(sum, array, i + 1);

		sum += array[i];

		dfs(sum, array, i + 1);

	}

}
