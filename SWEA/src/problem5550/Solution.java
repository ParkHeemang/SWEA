package problem5550;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		String input_String = sc.nextLine();

		boolean[] remain = new boolean[input_String.length()];
		for (int i = 0; i < remain.length; i++) {

			remain[i] = true;

		}

		int result = -1;

		int i = 0;
		while (true) {

			if (input_String.charAt(i) == 'c' && remain[i]) {

				remain[i] = false;
				break;
			} else {
				i++;
			}
			
			
			
			if(i==remain.length-1) {
				
				
				//
				break;
			}
			

		}

		i = 0;
		while (true) {

			if (input_String.charAt(i) == 'r' && remain[i]) {

				remain[i] = false;
				break;
			} else {
				i++;
			}

		}
		i = 0;
		while (true) {

			if (input_String.charAt(i) == 'o' && remain[i]) {

				remain[i] = false;
				break;
			} else {
				i++;
			}

		}
		i = 0;
		while (true) {

			if (input_String.charAt(i) == 'a' && remain[i]) {

				remain[i] = false;
				break;
			} else {
				i++;
			}

		}
		i = 0;
		while (true) {

			if (input_String.charAt(i) == 'k' && remain[i]) {

				remain[i] = false;
				break;
			} else {
				i++;
			}

		}

	}

}
