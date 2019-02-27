package problem1229;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {

			int N = sc.nextInt();

			ArrayList<String> arr_list = new ArrayList<String>();

			for (int i = 0; i < N; i++) {

				arr_list.add(sc.next());
			}

			int instruct_num = sc.nextInt();

			for (int i = 0; i < instruct_num; i++) {

				String instruct_case = sc.next();

				if (instruct_case.equals("I")) {

					int x = sc.nextInt(); // ÀÎµ¦½º
					int y = sc.nextInt(); // ¼ýÀÚ °¹¼ö

					for (int j = 0; j < y; j++) {

						arr_list.add(x + j, sc.next());

					}

				} else {

					int x = sc.nextInt();
					int y = sc.nextInt();

					for (int j = 0; j < y; j++) {

						arr_list.remove(x);

					}

				}

			}
			
			
			
			System.out.print("#"+t);
			
			for (int i = 0; i < 10; i++) {
				
				System.out.print(" "+arr_list.get(i));
				
			}
			
			System.out.println();
			
			
			
			

		}

	}

}
