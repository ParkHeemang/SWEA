package problem4406;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {

			String input_string = sc.nextLine();
			String answer = "";

			for (int j = 0; j < input_string.length(); j++) {

				if (input_string.charAt(j) == 'a' || input_string.charAt(j) == 'e' || input_string.charAt(j) == 'i'
						|| input_string.charAt(j) == 'o' || input_string.charAt(j) == 'u') {

					continue;

				} else {

					answer += input_string.charAt(j);
				}

			}

			System.out.println("#" + (i + 1) + " " + answer);

		}

	}

}
