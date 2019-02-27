package problem5987;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

	static ArrayList<int[]> cond;
	static HashSet<int[]> hs = new HashSet<int[]>();
	static int M;
	static int N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			N = sc.nextInt();
			M = sc.nextInt();

			cond = new ArrayList<int[]>();

			for (int j = 1; j <= M; j++) {

				int[] new_cond = { sc.nextInt(), sc.nextInt() };
				cond.add(new_cond);

			}

			int[] case_arr = new int[N]; // 0으로 초기화됨

			dfs(case_arr, 0);

			System.out.println(hs.size());

		}

	}

	private static void dfs(int[] case_arr, int count) {

		// 배열크기만큼(N) 채웟는지 검사하고

		if (count == N) {

			System.out.println("hs에 추가");

			for (int i = 0; i < case_arr.length; i++) {

				System.out.print(case_arr[i] + " ");

			}

			System.out.println();
			System.out.println();

			hs.add(case_arr);
			return;
		}

		// 중복이 안되는지 카운트로 체크하고

		for (int i = 1; i <= N; i++) { // 케이스 별로 반복

			boolean case_bool = true;

			for (int j = 0; j < count; j++) { // 이전에 들어간 숫자들(j)과 비교

				System.out.println("와 " + i + "를 비교합니다.");

				if (i == case_arr[j]) { // 이번에 들어갈 숫자와 이전 숫자가 중복되면

					System.out.println("중복 : " + i + " 와 " + j + "번쨰 " + case_arr[j]);
					case_bool = false;
					break;

				}							

				for (int j2 = 0; j2 < cond.size(); j2++) { // 이번에 들어갈 숫자와 이전 배열들을 조건 검사

					if (case_arr[j] == cond.get(j2)[1] && i == cond.get(j2)[0]) {

						System.out.println("조건위반: 이번에 들어갈" + i + " 와 " + j + "번째" + case_arr[j]);
						case_bool = false;
						break;

					}

				}

			}

			if (!case_bool) {

				continue;
			}
			
			
			

			int[] copy = new int[N];

			for (int j = 0; j < case_arr.length; j++) {

				copy[j] = case_arr[j];

			}

			copy[count] = i;

			dfs(copy, count + 1);

		}

	}

}
