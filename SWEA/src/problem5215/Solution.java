package problem5215;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	static int[] answer_list;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		answer_list = new int[T];

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();
			int L = sc.nextInt();

			ArrayList<int[]> material_arr = new ArrayList<int[]>();

			for (int j = 0; j < N; j++) {

				int[] material = { sc.nextInt(), sc.nextInt() };

				material_arr.add(material);

			}

			count_cases(material_arr, 1, 0, L);
			

		}
		
		

		for (int i = 0; i < answer_list.length; i++) {

			System.out.println("#" + (i + 1) + " " + answer_list[i]);
		}

	}

	private static void count_cases(ArrayList<int[]> material_arr, int count, int max_score, int max_kcal) { // 한 조합에대한
																											// 경우의수

		int max_count = (int) Math.pow(2, material_arr.size());

		if (count >= max_count) {

			System.out.println();
			return;
		}
		int[] arr_use = new int[material_arr.size()];
		for (int i = 0; i < arr_use.length; i++) {
			arr_use[i] = 0;
		}

		String binary = Integer.toBinaryString(count); // 2진수 string으로 바꾸기
														// 1~ 100000(2)

		System.out.println(binary);

		for (int i = 0; i < binary.length(); i++) {
			arr_use[material_arr.size() - 1 - i] = Integer.parseInt("" + binary.charAt(binary.length() - 1 - i));
		}

		for (int i = 0; i < arr_use.length; i++) {
			System.out.print(arr_use[i] + " ");
		}
		System.out.println();

		int kcal_sum = 0;
		int score_sum = 0;
		for (int i = 0; i < arr_use.length; i++) {

			if (arr_use[i] == 1) {

				
				score_sum += material_arr.get(i)[0];
				kcal_sum += material_arr.get(i)[1];
			}
		}

		if (kcal_sum < max_kcal) {

			if (score_sum > max_score) {
				max_score = score_sum;

//				System.out.println("--------------------------");
//				System.out.print("조합 : ");
//				for (int i = 0; i < arr_use.length; i++) {
//					System.out.print(arr_use[i]+" ");
//				}
//				System.out.print("칼로리: ");
//				System.out.println(kcal_sum);
//				System.out.println("점수합계 : ");
//				System.out.println(score_sum);
//				System.out.println("--------------------------");
			}
			
			

		}

	

	}

}
