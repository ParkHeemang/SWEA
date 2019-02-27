package problem3143;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			String input[] = br.readLine().split(" ");

			String A = input[0];
			String B = input[1];

			int Bsum = 0;

			for (int j = 0; j < A.length(); j++) { // j : A를 도는 인덱스

				if (A.charAt(j) == B.charAt(0)) {

					boolean same = true;
					for (int k = 0; k < B.length(); k++) { // k : B를 도는 인덱스

						if (B.charAt(k) != A.charAt(j + k)) {
							same = false;
							break;

						}

					}

					if (same)
						Bsum++;

				}

			}

			System.out.println("#" + (i + 1) + " " + (A.length() - (B.length() - 1) * Bsum));

		}

	}

}
