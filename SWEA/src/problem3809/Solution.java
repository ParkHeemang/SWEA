package problem3809;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) { // �׽�Ʈ ���̽����� �ݺ�

			int N = sc.nextInt();
			String string = "";
			for (int j = 0; j < N; j++) { // ���ڿ��� �Է°� �ϼ�

				string += sc.nextInt();

			}

			int count = 0; // �񱳴��
			boolean gogo;

			while (true) { // count�� ���� ��Ű�鼭

				gogo = false;

				String count_string = Integer.toString(count);
				int count_String_length = count_string.length();

				for (int j = 0; j < string.length() - count_String_length + 1; j++) { // string�� ���鼭

					if (string.substring(j, j + count_String_length).equals(count_string)) {
						gogo = true;

					}

				}

				if (gogo) {

					count++;
				} else {

					System.out.println("#" + (i + 1) + " " + count);
					break;

				}

			}

		}

	}

}
