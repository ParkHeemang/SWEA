package problem5789;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		ArrayList<int[]> answer_arr = new ArrayList<int[]>();

		for (int k = 0; k < T; k++) {

			int N = sc.nextInt();
			int Q = sc.nextInt();

			int[] box = new int[N];

			for (int i = 1; i <= Q; i++) {

				int L = sc.nextInt();
				int R = sc.nextInt();
				for (int j = L - 1; j <= R - 1; j++) {

					box[j] = i;

				}

			}

			answer_arr.add(box);

		}

		for (int i = 0; i < answer_arr.size(); i++) {

			System.out.print("#" + (i + 1));
			for (int j = 0; j < answer_arr.get(i).length; j++) {
				System.out.print(" " + answer_arr.get(i)[j]);
			}
			System.out.println();

		}

	}

}
