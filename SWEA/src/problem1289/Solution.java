package problem1289;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int k = 0; k < T; k++) { // 아예같게

			String[] from = sc.nextLine().split("");
			int[] memory = new int[from.length];

			for (int j = 0; j < from.length; j++) {
				memory[j] = Integer.parseInt(from[j]);
			}

			for (int j = 0; j < memory.length; j++) {
				System.out.println(memory[j]);
			}

			int i = 0;

			int bigyo[] = new int[memory.length];

			boolean same = true;
			int current_num = 0;

			while (true) {

				if (memory[i] == 1) {

					for (int j = i; j < bigyo.length; j++) {

						bigyo[j] = 1;
					}

				}

				for (int j = 0; j < bigyo.length; j++) {

					if (memory[j] != bigyo[j]) {

						same = false;
						break;
					}

				}

				i++;

			}

		}

	}

	public static void change(int[] memory, int i, int number) {

		for (int j = i; j < memory.length; j++) {

			memory[j] = number;

		}

	}

}
