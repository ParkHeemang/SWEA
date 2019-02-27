package problem5356;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		String[] answer_list = new String[T];
		for (int i = 0; i < answer_list.length; i++) {
			answer_list[i] = "";
		}

		sc.nextLine();

		for (int i = 0; i < T; i++) {

			String[][] map = new String[5][15];

			int max = 0;

			for (int j = 0; j < map.length; j++) {

				String input_string = sc.nextLine();

				if (max < input_string.length()) {
					max = input_string.length();
				}

				for (int j2 = 0; j2 < input_string.length(); j2++) {

					map[j][j2] = "" + input_string.charAt(j2);

				}

			}

			for (int j = 0; j < map[0].length; j++) {

				for (int j2 = 0; j2 < map.length; j2++) {

					if (map[j2][j] != null) {

						answer_list[i] += map[j2][j];
					} else {
						continue;
					}

				}
			}

		}

		for (int i = 0; i < answer_list.length; i++) {

			System.out.println("#" + (i + 1) + " " + answer_list[i]);

		}

	}

}
