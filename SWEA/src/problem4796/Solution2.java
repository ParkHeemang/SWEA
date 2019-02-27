package problem4796;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();
			int[] mountains = new int[N];
			int count = 0;
			for (int j = 0; j < N; j++) {
				mountains[j] = sc.nextInt();
			}
			for (int i = 0; i < mountains.length - 2; i++) {
				for (int j = i + 2; j < mountains.length; j++) {
					for (int mountain = i + 1; mountain < j; mountain++) {
						boolean asc = true;
						boolean desc = true;
						for (int l = i; l < mountain; l++) {
							if (mountains[l] > mountains[l + 1]) {
								asc = false;
								break;
							}
						}
						for (int l = mountain; l < j; l++) {
							if (mountains[l] < mountains[l + 1]) {
								desc = false;
								break;
							}
						}
						if (asc && desc) {
							count++;
							break;
						}
							
					}
				}
			}
			System.out.println("#" + (k + 1) + " " + count);
		}
	}
}
