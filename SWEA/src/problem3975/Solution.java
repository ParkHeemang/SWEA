package problem3975;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			float A = sc.nextFloat();
			float B = sc.nextFloat();
			float C = sc.nextFloat();
			float D = sc.nextFloat();

			if (A / B > C / D) {

				System.out.println("#"+(i)+ " ALICE");

			} else if (A / B == C / D) {

				System.out.println("#"+(i)+ " DRAW");

			} else {

				System.out.println("#"+(i)+ " BOB");
			}

		}

	}

}
