package problem4796;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();
			int[] mountains = new int[N];
			int count = 0;
			for (int j = 0; j < N; j++) {
				mountains[j] = sc.nextInt();
			}

			for (int i = 0; i < mountains.length - 2; i++) {
				if (mountains[i] > mountains[i + 1]) {
					continue;
				}
				for (int j = i + 2; j < mountains.length; j++) {
					int m = i;
					while (mountains[m] < mountains[m + 1] && m<j) {
						m++;
					}

					if (m == j) {
						continue;
					} else {						
						while (true) {
							if (mountains[m] > mountains[m + 1]) {
								m++;
							} else {							
								break;
							}
							if (m == j) {
								count++;
								break;
							}
						}
					}
				}
			}

			System.out.println("#" + (k + 1) + " " + count);

		}

	}

}
