package problem1204;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트 케이스 숫자
		int[] testset_answer_arr = new int[10];

		for (int i = 0; i < T; i++) { // 테스트 케이스마다 반복

			int most_num = -1; // 숫자 나오는 빈도(갱신)
			int answer = -1; // 가장 많이나온 숫자

			sc.nextInt();

			int[] score_arr = new int[101]; // 점수마다 분포를 배열로 기록
			for (int j = 0; j < score_arr.length; j++) {

				score_arr[j] = 0;

			}

			for (int j = 0; j < 1000; j++) { // 1000명 반복

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
