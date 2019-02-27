package problem1824;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) { // �׽�Ʈ ���̽���ŭ �ݺ�

			int N = sc.nextInt(); // ���� Ƚ��

			int[] array = new int[100];

			for (int j = 0; j < array.length; j++) { // ��ϰ� �Է¹ޱ�

				array[j] = sc.nextInt();

			}

			int max = 0;
			int min = 0;

			for (int j = 0; j < N; j++) { // ���� Ƚ����ŭ �ݺ�

				max = 1;
				min = 100;

				for (int k = 0; k < array.length; k++) { // �ּ� ���� , �ִ� ���� ���ϱ�

					if (min > array[k]) {

						min = array[k];

					}

					if (max < array[k]) {

						max = array[k];
					}

				}

				int min_idx = -1;
				int max_idx = -1;

				for (int k = 0; k < array.length; k++) { // ���� ù��° �ε����� ������ ���

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

			for (int k = 0; k < array.length; k++) { // �ּ� ���� , �ִ� ���� ���ϱ�

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
