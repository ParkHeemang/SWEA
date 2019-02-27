package problem6730;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList<int[]> answer_arr = new ArrayList<int[]>();

		for (int i = 0; i < T; i++) { // 테스트 케이스 만큼 반복

			int up_max = 0;
			int down_max = 0;

			int block_num = sc.nextInt(); // 블록의 갯수
			int[] block_list = new int[block_num];

			for (int j = 0; j < block_list.length; j++) { // 블록의 갯수만큼 반복

				block_list[j] = sc.nextInt();

			}

			for (int j = 1; j < block_list.length; j++) {

				if (block_list[j] > block_list[j - 1]) {

					int up = block_list[j] - block_list[j - 1];
					if (up > up_max) {
						up_max = up;
					}

				} else if (block_list[j] < block_list[j - 1]) {

					int down = block_list[j - 1] - block_list[j];
					if (down > down_max) {
						down_max = down;

					}

				}

			}

			int[] answer_list = { up_max, down_max };
			answer_arr.add(answer_list);

		}

		for (int i = 0; i < answer_arr.size(); i++) {

			System.out.println("#" + (i + 1) + " " + answer_arr.get(i)[0] + " " + answer_arr.get(i)[1]);

		}

	}

}
