package problem1204;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // �׽�Ʈ ���̽� ����
		int[] testset_answer_arr = new int[10];

		for (int i = 0; i < T; i++) { // �׽�Ʈ ���̽����� �ݺ�

			int most_num = -1; // ���� ������ ��(����)
			int answer = -1; // ���� ���̳��� ����

			sc.nextInt();

			int[] score_arr = new int[101]; // �������� ������ �迭�� ���
			for (int j = 0; j < score_arr.length; j++) {

				score_arr[j] = 0;

			}

			for (int j = 0; j < 1000; j++) { // 1000�� �ݺ�

				int score = sc.nextInt();
				score_arr[score]++;

			}

			for (int j = 0; j < score_arr.length; j++) {

				if (score_arr[j] >= most_num) {

					most_num = score_arr[j];
					answer = j;
				}

			}

			testset_answer_arr[i] = answer;

		}

		for (int j = 0; j < testset_answer_arr.length; j++) {

			System.out.println("#" + (j + 1) + " " + testset_answer_arr[j]);

		}

	}

}
