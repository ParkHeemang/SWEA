package SWExpertAcademy;

import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args) throws Exception {
		int o_x, o_y;
		int[][] dot = new int[3][2];
		float answer;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 2; j++)
				dot[i][j] = Integer.parseInt(st.nextToken());

		o_x = dot[2][0]; // x3
		o_y = dot[2][1]; // y3

		for (int i = 0; i < 3; i++) // 평행이동
			for (int j = 0; j < 2; j++) {
				if (j == 0)
					dot[i][j] -= o_x;
				else
					dot[i][j] -= o_y;
			}
		answer = (float) Math.abs((dot[0][0] * dot[1][1] - dot[1][0] * dot[0][1])) / 2;
		System.out.println(answer);
	}
}
