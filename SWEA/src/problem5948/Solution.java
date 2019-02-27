package problem5948;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();

		int T = sc.nextInt();
		int[] answer_list = new int[T];
		HashSet<Integer> hs;

		for (int i = 0; i < answer_list.length; i++) { // 테스트 케이스 마다 반복

			hs = new HashSet<Integer>();
			int[] array = new int[7];
			for (int j = 0; j < array.length; j++) {

				array[j] = sc.nextInt();

			}

			int index = 0;
			int[] case_num = new int[210];

			for (int j = 0; j < array.length; j++) {
				for (int j2 = 0; j2 < array.length; j2++) {
					for (int j3 = 0; j3 < array.length; j3++) {
						if (j != j2 && j2 != j3 && j != j3) {
							hs.add(array[j] + array[j2] + array[j3]);
						}
					}
				}
			}

			ArrayList<Integer> case_arr = new ArrayList(hs);
			int[] case_array = new int[case_arr.size()];
			for (int j = 0; j < case_array.length; j++) {
				case_array[j] = case_arr.get(j);
			}

			Arrays.sort(case_array);
			answer_list[i] = case_array[case_array.length - 5];

		}

		for (int i = 0; i < answer_list.length; i++) {
			System.out.println("#" + (i + 1) + " " + answer_list[i]);

		}

	}

}
