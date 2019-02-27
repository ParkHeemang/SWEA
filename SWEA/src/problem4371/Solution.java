package problem4371;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();

			int[] the_days = new int[N];
			ArrayList<Integer> arr = new ArrayList<Integer>();

			for (int j = 0; j < the_days.length; j++) {

				the_days[j] = sc.nextInt();

			}

			for (int j = 1; j < the_days.length; j++) {

				boolean DV = false;

				for (int k = 0; k < arr.size(); k++) {

					if ((the_days[j] - 1) % arr.get(k) == 0) {

						for (int k2 = 1; k2 <= (the_days[j] - 1) / arr.get(k); k2++) {

							if (Arrays.asList(the_days).contains(arr.get(k) * k2)) {
								System.out.println("들어오냐");
								DV = true;
							} else {
								DV = false;
							}

						}

					}

				}

				if (!DV) {

					arr.add(the_days[j] - 1);

				}

			}

			System.out.println(arr.size());

		}

	}

}
