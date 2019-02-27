package problem6485;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<int[]> answer_arr = new ArrayList<int[]>();

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int[] BusStops = new int[5002];

			int N = sc.nextInt();

			for (int j = 0; j < N; j++) {

				int Ai = sc.nextInt();
				int Bi = sc.nextInt();

				for (int k = Ai; k <= Bi; k++) {

					BusStops[k]++;

				}

			}

			int P = sc.nextInt();
			int[] BusStop_list = new int[P];

			for (int j = 0; j < P; j++) {

				BusStop_list[j] = BusStops[sc.nextInt()];
			}

			answer_arr.add(BusStop_list);

		}

		for (int i = 0; i < T; i++) {

			System.out.print("#" + (i + 1));

			for (int j = 0; j < answer_arr.get(i).length; j++) {

				System.out.print(" " + answer_arr.get(i)[j]);

			}
			System.out.println();

		}

	}

}
