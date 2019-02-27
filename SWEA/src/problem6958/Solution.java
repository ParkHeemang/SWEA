package problem6958;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] array = new int[N][M];

			for (int i = 0; i < N; i++) {

				for (int j = 0; j < M; j++) {

					array[i][j] = sc.nextInt();

				}

			}

			int max = 0;

			int n = 0; // 최고점수 동점자수

			for (int i = 0; i < array.length; i++) {

				int sum = 0;

				for (int j = 0; j < array.length; j++) {

					sum += array[i][j];

				}

				if (sum > max) {

					max = sum;

					n = 1;

				} else if (sum == max) {

					n++;
				}

			}
			
			
			System.out.println("#"+(t+1)+" "+n+" "+max);
			
			
			
			
			

		}

	}

}
