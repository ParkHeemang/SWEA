package problem1989;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {

			String string = sc.nextLine();
			String string_reverse = "";
			for (int j = string.length() - 1; j >= 0; j--)

			{
				string_reverse = string_reverse + string.charAt(j);
			}

			if (string.equals(string_reverse)) {
				System.out.println("#" + (i + 1) + " " + 1);
			} else {
				System.out.println("#" + (i + 1) + " " + 0);
			}

		}

	}

}
