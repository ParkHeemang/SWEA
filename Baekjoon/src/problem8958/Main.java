package problem8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] answer_list = new int[T];

		sc.nextLine();

		for (int i = 0; i < answer_list.length; i++) {

			String input_OX = sc.nextLine();

			String[] array_word;
			array_word = input_OX.split("");
			int sum = 0;

			int accumulate = 1;

			for (int j = 0; j < array_word.length; j++) {

				if (array_word[j].equals("O")) {

					sum += accumulate++;

				} else {

					accumulate = 1;
				}

			}

			answer_list[i] = sum;

		}

		for (int i = 0; i < answer_list.length; i++) {

			System.out.println(answer_list[i]);

		}

	}

}
