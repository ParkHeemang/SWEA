package problem1954;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList<int[][]> answer_arr = new ArrayList<int[][]>();

		for (int i = 0; i < T; i++) { // 초기화 (0행 배치)

			int N = sc.nextInt();
			int State = 1; // 증,감
			int go_num = N; // 채우는 갯수
			int index = 1; // 반복변수, 채우는수
			int a = 0;
			int b = -1; // 행,열

			int[][] array = new int[N][N];

			while (true) {

				for (int j = 0; j < N; j++) { // 열

					b = b + State;

					array[a][b] = index++;

				}

				N = N - 1; // N =3

				if (N == 0) {
					break;

				}

				for (int j = 0; j < N; j++) {

					a = a + State;

					array[a][b] = index++;

				}

				State = State * (-1);

			}

			answer_arr.add(array);

		}

		for (int i = 0; i < answer_arr.size(); i++) {

			System.out.println("#" + (i + 1));

			for (int j = 0; j < answer_arr.get(i).length; j++) {

				for (int j2 = 0; j2 < answer_arr.get(i)[j].length; j2++) {

					System.out.print(answer_arr.get(i)[j][j2] + " ");

				}

				System.out.println();

			}

		}

	}

}
