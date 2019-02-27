package problem4047;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {

			int[] S = new int[13];
			int[] D = new int[13];
			int[] H = new int[13];
			int[] C = new int[13];

			for (int j = 0; j < 13; j++) {

				S[j] = 1;
				D[j] = 1;
				H[j] = 1;
				C[j] = 1;

			}

			String input_string = sc.nextLine();

			for (int j = 0; j < input_string.length(); j += 3) {

				String card = input_string.substring(j, j + 3);

				char card_type = card.charAt(0);
				String card_num_string = card.substring(1, 3);
				int card_num = Integer.parseInt(card_num_string);

				if (card_type == 'S') {

					S[card_num - 1]--;
				} else if (card_type == 'D') {

					D[card_num - 1]--;
				} else if (card_type == 'H') {

					H[card_num - 1]--;
				} else if (card_type == 'C') {

					C[card_num - 1]--;
				}

			}
			boolean error = false;
			for (int k = 0; k < S.length; k++) {

				if (S[k] < 0 || D[k] < 0 || H[k] < 0 || C[k] < 0) {

					error = true;
					break;
				}

			}

			if (error) {

				System.out.println("#"+(i+1)+" ERROR");
			} else {

				int sumS = 0;
				int sumD = 0;
				int sumH = 0;
				int sumC = 0;

				for (int j = 0; j < C.length; j++) {

					sumS += S[j];
					sumD += D[j];
					sumH += H[j];
					sumC += C[j];

				}
				System.out.println("#"+(i+1)+" "+sumS + " " + sumD + " " + sumH + " " + sumC);

			}

		}

	}

}
