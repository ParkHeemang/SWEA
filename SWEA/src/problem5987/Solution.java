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

			int[] case_arr = new int[N]; // 0���� �ʱ�ȭ��

			dfs(case_arr, 0);

			System.out.println(hs.size());

		}

	}

	private static void dfs(int[] case_arr, int count) {

		// �迭ũ�⸸ŭ(N) ä�m���� �˻��ϰ�

		if (count == N) {

			System.out.println("hs�� �߰�");

			for (int i = 0; i < case_arr.length; i++) {

				System.out.print(case_arr[i] + " ");

			}

			System.out.println();
			System.out.println();

			hs.add(case_arr);
			return;
		}

		// �ߺ��� �ȵǴ��� ī��Ʈ�� üũ�ϰ�

		for (int i = 1; i <= N; i++) { // ���̽� ���� �ݺ�

			boolean case_bool = true;

			for (int j = 0; j < count; j++) { // ������ �� ���ڵ�(j)�� ��

				System.out.println("�� " + i + "�� ���մϴ�.");

				if (i == case_arr[j]) { // �̹��� �� ���ڿ� ���� ���ڰ� �ߺ��Ǹ�

					System.out.println("�ߺ� : " + i + " �� " + j + "���� " + case_arr[j]);
					case_bool = false;
					break;

				}							

				for (int j2 = 0; j2 < cond.size(); j2++) { // �̹��� �� ���ڿ� ���� �迭���� ���� �˻�

					if (case_arr[j] == cond.get(j2)[1] && i == cond.get(j2)[0]) {

						System.out.println("��������: �̹��� ��" + i + " �� " + j + "��°" + case_arr[j]);
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
