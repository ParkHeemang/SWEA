package problem6900;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			int N = sc.nextInt(); // 당첨번호 갯수
			int M = sc.nextInt(); // 복권 갯수

			String[] winning_number = new String[N];
			int[] winning_prize = new int[N];
			String[] ticket_number = new String[M];

			for (int j = 0; j < winning_number.length; j++) {

				winning_number[j] = sc.next();

				winning_prize[j] = sc.nextInt();

			}

			for (int j = 0; j < ticket_number.length; j++) {

				ticket_number[j] = sc.next();

			}

			int sum = 0;

			for (int j = 0; j < winning_number.length; j++) {	 		// 당첨번호 배열을 도는 반복문

				for (int k = 0; k < ticket_number.length; k++) {		 // 티켓을 도는 반복문

					boolean same = true;						//당첨번호와 티켓이 모두 일치하는지 판단하는 불리언

					for (int l = 0; l < winning_number[j].length(); l++) { // 당첨번호 원소 문자열 내부를 도는 반복문

						if (winning_number[j].charAt(l) == '*') {

							continue;
						} else if (winning_number[j].charAt(l) != ticket_number[k].charAt(l)) {

							same = false;
							break;

						}

					}

					if (same) {

						sum += winning_prize[j];

					}

				}

			}

			System.out.println("#" + i + " " + sum);

		}

	}

}
