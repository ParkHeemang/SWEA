package problem1824;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) { // 테스트 케이스만큼 반복

			int N = sc.nextInt(); // 덤프 횟수

			int[] array = new int[100];

			for (int j = 0; j < array.length; j++) { // 블록값 입력받기

				array[j] = sc.nextInt();

			}

			int max = 0;
			int min = 0;

			for (int j = 0; j < N; j++) { // 덤프 횟수만큼 반복

				max = 1;
				min = 100;

				for (int k = 0; k < array.length; k++) { // 최소 높이 , 최대 높이 구하기

					if (min > array[k]) {

						min = array[k];

					}

					if (max < array[k]) {

						max = array[k];
					}

				}

				int min_idx = -1;
				int max_idx = -1;

				for (int k = 0; k < array.length; k++) { // 각각 첫번째 인덱스만 변수에 담기

					if (array[k] == min) {

						min_idx = k;
						break;

					}

				}

				for (int k = 0; k < array.length; k++) {

					if (array[k] == max) {

						max_idx = k;
						break;
					}

				}

				array[max_idx]--;
				array[min_idx]++;

			}

			max = 1;
			min = 100;

			for (int k = 0; k < array.length; k++) { // 최소 높이 , 최대 높이 구하기

				if (min > array[k]) {

					min = array[k];

				}

				if (max < array[k]) {

					max = array[k];
				}

			}

			System.out.println("#" + (i + 1) + " " + (max - min));

		}

	}

}
