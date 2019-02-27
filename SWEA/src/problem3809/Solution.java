package problem3809;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) { // 테스트 케이스마다 반복

			int N = sc.nextInt();
			String string = "";
			for (int j = 0; j < N; j++) { // 문자열로 입력값 완성

				string += sc.nextInt();

			}

			int count = 0; // 비교대상
			boolean gogo;

			while (true) { // count를 증가 시키면서

				gogo = false;

				String count_string = Integer.toString(count);
				int count_String_length = count_string.length();

				for (int j = 0; j < string.length() - count_String_length + 1; j++) { // string을 돌면서

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
