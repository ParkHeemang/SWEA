package problem4789;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int[] answer_list = new int[T];

		for (int i = 0; i < T; i++) {

			String people = sc.nextLine();

			int[] array = new int[people.length()];

			for (int j = 0; j < array.length; j++) {
				array[j] = Integer.parseInt("" + people.charAt(j));
			}

			int current_girib = array[0];
			int need_people = 0; // 충원이 필요한사람의 합계

			for (int j = 1; j < array.length; j++) {

				if (array[j] != 0) {

					if (current_girib < j) {

						need_people += j - (current_girib);
						current_girib = current_girib + array[j] + j - current_girib;

					} else {

						current_girib += array[j];

					}

				}

			}

			answer_list[i] = need_people;

		}

		for (int i = 0; i < answer_list.length; i++) {

			System.out.println("#" + (i + 1) + " " + answer_list[i]);

		}

	}

}
