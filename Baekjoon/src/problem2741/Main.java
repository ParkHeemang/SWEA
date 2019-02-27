package problem2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {

			array[i] = sc.nextInt();

		}

		// 선택 정렬
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					int temp;

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}

		// 버블정렬 i는 반복제어변수 j, j+1
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {

				if (array[j] > array[j + 1]) {

					int temp;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}

			}

		}

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}

	}

}
