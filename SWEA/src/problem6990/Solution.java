package problem6990;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			String[] win_num = new String[sc.nextInt()];
			int[] win_prize = new int[win_num.length];

			String[] ticket_num = new String[sc.nextInt()];

			for (int i = 0; i < win_num.length; i++) {

				win_num[i] = sc.next();
				win_prize[i] = sc.nextInt();

			}

			for (int i = 0; i < ticket_num.length; i++) {

				ticket_num[i] = sc.next();
			}

			for (int i = 0; i < win_num.length; i++) {

				for (int j = 0; j < ticket_num.length; j++) {

					int k = 0;

					boolean same = true;
					while (true) { // string내에서 문자 각각을 도는 반복문

						if (win_num[i].charAt(k) == '*') {

							k++;
						} else if (win_num[i].charAt(k) == ticket_num[j].charAt(k)) {
							k++;

						} else {

							same = false;
							break;
						}

					}

					if (same) {

						
						
						
						
					}

				}

			}

		}

	}

}
