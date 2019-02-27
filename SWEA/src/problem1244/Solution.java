package problem1244;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		ArrayList<int[]> answer_list = new ArrayList<int[]>();

		for (int i = 0; i < T; i++) {

			int input_num = sc.nextInt();
			int[] num_list = new int[6];

			for (int j = 0; j < 6; j++) { // 배열에 배치

				num_list[j] = input_num / (int) Math.pow(10, 5 - j);
				input_num -= num_list[j] * (int) Math.pow(10, 5 - j);

			}
			
			
			for (int j = 0; j < num_list.length; j++) {
				
				
				System.out.print(num_list[j]+" ");
				
			}
			
			
			

			int N = sc.nextInt(); // 바꾸는 횟수

			while (N > 0) {
				
				
				for (int j = 0; j < num_list.length - 1; j++) {
					
					
					if(num_list[j]==0) continue;

					// 최댓값 알애니기

					int max = 0;

					for (int k = j; k < num_list.length; k++) { // 최댓값 체크

						if (num_list[k] > max) {

							max = num_list[k];
						}

					}

					// 가장 끝에있는 최댓값의 idx알아내기
					int max_num_idx = -1;

					for (int k = j; k < num_list.length; k++) {

						if (num_list[k] == max) {

							max_num_idx = k;

						}

					}
					
					
					//바꾸기 작업

					if (num_list[j] == max) {
						continue;

					} else {

						int temp;

						temp = num_list[j];
						num_list[j] = num_list[max_num_idx];
						num_list[max_num_idx] = temp;
						N--;

					}

				}

			}

			answer_list.add(num_list);

		}
		
		
		for (int i = 0; i < answer_list.size(); i++) {
			
			
			System.out.println("여기오니");
			for (int k = 0; k < answer_list.get(i).length; k++) {
				
				System.out.print(answer_list.get(i)[k]+" ");
				
			}
			
		}

	}

}
