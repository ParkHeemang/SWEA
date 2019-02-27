package problem4751;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		int[] answer_list = new int[T];

		for (int i = 0; i < answer_list.length; i++) {

			String[] string = sc.nextLine().split("");

		

			for (int j = 0; j < string.length; j++) {

				if (j == 0) {
					System.out.print("..#..");

				} else {
					System.out.print(".#..");

				}

			}
			System.out.println();
			for (int j = 0; j < string.length; j++) {

				if (j == 0) {
					System.out.print(".#.#.");

				} else {

					System.out.print("#.#.");
				}

			}
			System.out.println();

			for (int j = 0; j < string.length; j++) {

				if (j == 0) {

					System.out.print("#.");
					System.out.print(string[j]);
					System.out.print(".#");
				} else {

					System.out.print(".");
					System.out.print(string[j]);
					System.out.print(".#");
				}

			}
			System.out.println();

			for (int j = 0; j < string.length; j++) {

				if (j == 0) {
					System.out.print(".#.#.");

				} else {

					System.out.print("#.#.");
				}

			}
			System.out.println();

			for (int j = 0; j < string.length; j++) {

				if (j == 0) {
					System.out.print("..#..");

				} else {
					System.out.print(".#..");

				}

			}

			System.out.println();

		}

	}

}
