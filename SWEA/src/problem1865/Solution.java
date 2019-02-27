package problem1865;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int k = 0; k < T; k++) {

			int N = sc.nextInt();

			double[][] i_to_j = new double[N][N];

			for (int i = 0; i < i_to_j.length; i++) {

				for (int j = 0; j < i_to_j[i].length; j++) {

					i_to_j[i][j] = (double) sc.nextInt() / 100;

				}
			}

			double max = 0;

			
			
			
			for (int i = 0; i < i_to_j.length; i++) {// i명에 대해서 반복
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			

			
			System.out.println(max);
			System.out.println(max*100);
			String str = String.format("%.6f", max*100);

			System.out.println("#" + (k + 1) + " " + str);

		}

	}

}
