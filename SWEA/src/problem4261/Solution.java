package problem4261;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		String[] keypad = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		for (int t = 0; t < T; t++) {

			int count = 0;

			String S = sc.next();
			int N = sc.nextInt();

			sc.nextLine();

			String[] string_input = new String[N];

			for (int i = 0; i < N; i++) {

				string_input[i] = sc.next();

			}

			for (int i = 0; i < string_input.length; i++) { // 단어를 하나씩 돌면서

				String result = "";

				for (int j = 0; j < string_input[i].length(); j++) { // 문자열 내부를 도는 반복문

					for (int k = 0; k < keypad.length; k++) { // 키패드 하나하나 검사하는 반복문

						if (keypad[k].contains("" + string_input[i].charAt(j))) {

							result += (k + 1);
							break;

						}

					}

				}

				if (result.equals(S)) {

					count++;
				}

			}

			System.out.println("#" + (t + 1) + " " + count);

		}

	}

}
