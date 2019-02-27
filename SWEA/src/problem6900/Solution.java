package problem6900;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			int N = sc.nextInt(); // ��÷��ȣ ����
			int M = sc.nextInt(); // ���� ����

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

			for (int j = 0; j < winning_number.length; j++) {	 		// ��÷��ȣ �迭�� ���� �ݺ���

				for (int k = 0; k < ticket_number.length; k++) {		 // Ƽ���� ���� �ݺ���

					boolean same = true;						//��÷��ȣ�� Ƽ���� ��� ��ġ�ϴ��� �Ǵ��ϴ� �Ҹ���

					for (int l = 0; l < winning_number[j].length(); l++) { // ��÷��ȣ ���� ���ڿ� ���θ� ���� �ݺ���

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
