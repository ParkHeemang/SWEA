package problem3347;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			int N = sc.nextInt();
			int M = sc.nextInt();

			int[] Ai = new int[N];
			int[] voteA = new int[N];

			for (int j = 0; j < Ai.length; j++) {
				Ai[j] = sc.nextInt();
			}

			for (int j = 0; j < voteA.length; j++) {

				voteA[j] = 0;
			}

			int[] Bi = new int[M];
			for (int j = 0; j < Bi.length; j++) {

				Bi[j] = sc.nextInt();
			}

			for (int j = 0; j < Bi.length; j++) {

				for (int j2 = 0; j2 < Ai.length; j2++) {

					if (Ai[j2] <= Bi[j]) {
						voteA[j2]++;
						break;

					}

				}

			}

			int max_index = -1;
			int max = 0;

			for (int j = 0; j < voteA.length; j++) {

				if (voteA[j] > max) {

					max_index = j;
					max = voteA[j];
				}
			}

			System.out.println("#" + i + " " + (max_index+1));

		}

	}

}
