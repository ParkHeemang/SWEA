package problem2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 처음 입력 설탕수
		int N = sc.nextInt();

		int division5 = N / 5;

		int min_pack = 1001;

		int salt_pack_count = -1;

		for (int i = 0; i <= division5; i++) {

			if ((N - 5 * i) % 3 == 0) {

				salt_pack_count = i + (N - 5 * i) / 3;
			}

		}

		System.out.println(salt_pack_count);

	}
}