package problem1215;

import java.util.Scanner;

public class Solution1215 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			int count = 0;

			int N = sc.nextInt();

			char[][] array = new char[8][8];

			for (int j = 0; j < array.length; j++) {
				String input = sc.next();
				for (int j2 = 0; j2 < array[j].length; j2++) {

					array[j][j2] = input.charAt(j2);

				}

			}

			// 가로 점검
			for (int j = 0; j < array.length; j++) {

				for (int j2 = 0; j2 < array.length - N + 1; j2++) {

					boolean cir = true;

					for (int k = 0; k < N / 2; k++) {

						if (array[j][j2+k] != array[j][j2+N-1-k]) {

							cir = false;

						}

					}

					if (cir) {

						count++;

					}

				}

			}
			
			// 세로 점검

			for (int j = 0; j < array.length; j++) {

				for (int j2 = 0; j2 < array.length - N + 1; j2++) {
					
					boolean cir = true;

					for (int k = 0; k < N / 2; k++) {

						if (array[j2+k][j] != array[j2+N-1-k][j]) {

							cir = false;

						}

					}

					if (cir) {

						count++;

					}									
					
				}

			}
			
			System.out.println("#"+i+" "+count);
			
			

		}

	}

}
