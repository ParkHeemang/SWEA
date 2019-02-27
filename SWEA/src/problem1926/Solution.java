package problem1926;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			String i_to_string = Integer.toString(i);

			int count = 0;

			for (int j = 0; j < i_to_string.length(); j++) {

				if (i_to_string.charAt(j) == '3' || i_to_string.charAt(j) == '6' || i_to_string.charAt(j) == '9') {

					count++;
				}

			}

			if (count == 0) {

				System.out.print(i+" ");
			} else {
				
				for (int j = 0; j < count; j++) {
					System.out.print("-");
					
				}
				System.out.print(" ");
				

			}

		}

	}

}
