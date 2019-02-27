package problem1213;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			int T = sc.nextInt();

			String search_String = sc.next();
			String full_String = sc.next();
			int count = 0;

			for (int j = 0; j < full_String.length(); j++) { // full_String ¹®ÀÚ¸¦ µ¼

				if (search_String.charAt(0) == full_String.charAt(j)) {

					boolean same = true;

					for (int j2 = 1; j2 < search_String.length(); j2++) {

						if (j + j2 >= full_String.length()) {

							same = false;
							break;
						}

						if (search_String.charAt(j2) != full_String.charAt(j + j2)) {

							same = false;

						}

					}

					if (same == true) {
						count++;

					}

				}

			}

			System.out.println("#" + i + " " + count);

		}

	}

}
