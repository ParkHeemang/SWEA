package problem2072.java;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] answer_list = new int[T];

		for (int i = 0; i < T; i++) {

			int count = 10; // 숫자의 갯수
			int[] num_arr = new int[10];
			int sum = 0;

			for (int j = 0; j < count; j++) { // 배열에 넣기

				num_arr[j] = sc.nextInt();

			}

			for (int j = 0; j < num_arr.length; j++) {

				if (num_arr[j] % 2 == 1) {

					sum += num_arr[j];
				}

			}

			answer_list[i] = sum;

		}

		for (int i = 0; i < answer_list.length; i++) {

			System.out.println("#" + (i + 1) + " " + answer_list[i]);
		}

	}

}
