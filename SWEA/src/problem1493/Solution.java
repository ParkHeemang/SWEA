package problem1493;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			int A = sc.nextInt();
			int B = sc.nextInt();

			int[] arrayA = number_to_location(A);
			int[] arrayB = number_to_location(B);

			int[] arrayC = { arrayA[0] + arrayB[0], arrayA[1] + arrayB[1] };

			int result = location_to_number(arrayC[0], arrayC[1]);

			System.out.println("#" + t + " " + result);

		}

	}

	private static int location_to_number(int x, int y) {

		int z = x + y - 1; // z��° ���� ����

		int result = 0;
		// �ϴ� z������ ���ڸ� ����
		for (int i = 1; i < z; i++) {

			result += i;

		}

		result += x;

		return result;

	}

	private static int[] number_to_location(int number) {

		int z = 1; // ���° �������� z��° �����ִ� ������ x+y �� z+1�� ��
		int[] result = new int[2];

		while (true) {

			if (number <= z) {

				result[0] = number;
				result[1] = z + 1 - number;
				break;

			} else {

				number -= z;
				z++;

			}

		}

		return result;

	}

}
