package problem4344;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		double[] answer_list = new double[T];

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();
			int sum = 0;

			int[] array = new int[N];

			for (int j = 0; j < N; j++) {

				array[j] = sc.nextInt();
				sum += array[j];

			}

			float average = (float) sum / N;

			int count = 0;

			for (int j = 0; j < N; j++) {

				if (array[j] > average) {

					count++;
				}

			}

			
			answer_list[i] = Math.round((double) count / N*100000)/(double)1000;
			

		}
		
		for (int i = 0; i < answer_list.length; i++) {
			System.out.println(answer_list[i]+"%");

			
		}

	}

}
