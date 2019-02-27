package problem1210;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = -1; // 행
		int b = -1; // 열

		for (int i = 0; i < 1; i++) { // 테스트 케이스마다 반복

			sc.nextInt();

			int[][] map = new int[100][100];

			for (int j = 0; j < map.length; j++) { // 입력

				for (int j2 = 0; j2 < map[j].length; j2++) {

					map[j][j2] = sc.nextInt();

				}
			}

			for (int j = 0; j < map.length; j++) {

				if (map[map.length - 1][j] == 2) {

					a = map.length - 1;
					b = j;

				}
			}

			System.out.println("시작점은 " + a + " " + b);
			
			ArrayList<int[]> arr = new ArrayList<int[]>();
			
					
			
			while (true) {

				if (b > 0 && map[a][b - 1] == 1) {

					while (b > 0 && map[a][b - 1] == 1) {

						b = b - 1;
						
						arr.add(new int[] {a,b});

					}

					a = a - 1;
					arr.add(new int[] {a,b});

				} else if (b < 9 && map[a][b + 1] == 1) {

					while (b < 9 && map[a][b + 1] == 1) {

						b = b + 1;
						arr.add(new int[] {a,b});

					}

					a = a - 1;
					arr.add(new int[] {a,b});

				} else {
					a = a - 1;
					arr.add(new int[] {a,b});

				}

				if (a == 0) {

					System.out.println("#" + (i + 1) + " " + b);
					for (int k = 0; k < arr.size(); k++) {
						
						for (int k2 = 0; k2 < arr.get(k).length; k2++) {
							
							System.out.print(arr.get(k)[k2]+" ");
							
						}
						
						System.out.println();
						
					}
					
					break;
					
					
				
					
					
					
					
				}

			}

		}

	}

}
