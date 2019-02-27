package problem6719_2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double[] answer_list = new double[T];

		for (int i = 0; i < answer_list.length; i++) {

			double A = 0;
			int N = sc.nextInt(); 
			int K = sc.nextInt(); 

			int[] Mlist = new int[N]; 

			for (int j = 0; j < N; j++) {

				int M = sc.nextInt();

				Mlist[j] = M;

			}

			Arrays.sort(Mlist);

			int temp;

			for (int j = 0; j < Mlist.length / 2; j++) { 

				temp = Mlist[j];
				Mlist[j] = Mlist[(Mlist.length - 1) - j];
				Mlist[(Mlist.length - 1) - j] = temp;

			}

			for (int j = 0; j < Mlist.length; j++) {

			}

			for (int j = K - 1; j >= 0; j--) {

				A = (A + Mlist[j]) / 2;

			}
			answer_list[i] = A;

		}

		for (int i = 0; i < answer_list.length; i++) {

			System.out.println("#" + (i + 1) + " " + answer_list[i]);

		}

	}

}
