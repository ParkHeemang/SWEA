package problem2007;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		sc.nextLine();

		for (int k = 0; k < T; k++) {

			String input_String = sc.nextLine();

			int index = 0; // �ݺ��������, ������ ���� index

			while (true) {

				String madi_String = "";

				for (int i = 0; i <= index; i++) { // �ش� �ε������� ���ڿ� �����

					madi_String += input_String.charAt(i);

				}

				String next_String = "";
				for (int i = index + 1; i <= index + 1 + index; i++) {

					next_String += input_String.charAt(i);

				}

				if (madi_String.equals(next_String)) {

					break;

				} else {
					index++;

				}

			}

			System.out.println("#" + (k + 1) + " " + (index + 1));

		}

	}
}