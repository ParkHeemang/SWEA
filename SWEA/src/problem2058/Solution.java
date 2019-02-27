package problem2058;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			sum += Integer.parseInt("" + input.charAt(i));
		}

		System.out.println(sum);

	}

}
