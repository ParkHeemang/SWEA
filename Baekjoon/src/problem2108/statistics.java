package problem2108;

import java.util.Arrays;
import java.util.Scanner;

public class statistics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] array = new int[N];
		int[] num_list = new int[8001]; // 0:0,1~4000: 양수, 4001~8000:음수
		for (int i = 0; i < num_list.length; i++) {
			num_list[i] = 0;
		}
		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			int input_num = sc.nextInt();
			array[i] = input_num;
			sum += input_num;

			if (input_num >= 0) {
				num_list[input_num]++;

			} else {

				num_list[4000 - input_num]++;

			}

		}

		Arrays.sort(array);// 정렬

		int max = -1;
		int choibin = 5000; // i주의
		boolean once = true;

		for (int i = 8000; i >= 4001; i--) {

			if (num_list[i] > max) {

				max = num_list[i];
				choibin = (i - 4000) * (-1);
				once = true;

			} else if (num_list[i] == max

			) {
				if (once) {

					choibin = (i - 4000) * (-1);
					once = false;
				}

			}

		}

		for (int i = 0; i <= 4000; i++) {

			if (num_list[i] > max) {

				max = num_list[i];
				choibin = i;
				once = true;

			} else if (num_list[i] == max

			) {
				if (once) {

					choibin = i;
					once = false;
				}

			}

		}

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] > max) {

				max = num_list[i];
				choibin = i;

			} else if (num_list[i] == max

			) {

			}

		}

		if (choibin > 4000) {

			choibin = (choibin - 4000) * (-1);
		}

		int sansool;

		if (sum >= 0) {

			sansool = (((float) sum / N - (sum / N)) >= 0.5) ? sum / N + 1 : sum / N;
		} else {
			sansool = (((float) sum / N - (sum / N)) <= -0.5) ? sum / N - 1 : sum / N;

		}
		int middle = array[array.length / 2];

		int range = array[array.length - 1] - array[0];

		System.out.println(sansool);
		System.out.println(middle);
		System.out.println(choibin);
		System.out.println(range);

	}

}
