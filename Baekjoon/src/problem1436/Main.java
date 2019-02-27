package problem1436;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static ArrayList<String> arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String case_num = "";

		gogo(N, case_num);

		int min = 3000;

		for (int i = 0; i < arr.size(); i++) {

			int string_length = arr.get(i).length();

			if (string_length < min) {

				min = string_length;

			}

		}

		System.out.println(min);

	}

	private static void gogo(int n, String case_num) {

		if (n == 1) {

			arr.add(case_num);
			return;

		} else {

			if (n % 3 == 0) {

				gogo(n / 3, case_num + "1");
			}

			if (n % 2 == 0) {

				gogo(n / 2, case_num + "2");

			}

			gogo(n - 1, case_num + "3");

		}

	}

}
