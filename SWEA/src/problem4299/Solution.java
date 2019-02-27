package problem4299;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int TheTiming = 11 * 24 * 60 + 11 * 60 + 11;
	

		for (int i = 0; i < T; i++) {

			int[] DHM = { sc.nextInt(), sc.nextInt(), sc.nextInt() };

			int sum = DHM[0] * 24 * 60 + DHM[1] * 60 + DHM[2];

			if (sum < TheTiming) {

				System.out.println("#"+(i+1)+" "+-1);
			} else {

				System.out.println("#"+(i+1)+" "+(sum - TheTiming));
			}

		}

	}

}
