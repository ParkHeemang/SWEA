package problem1228;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			int N = sc.nextInt();

			List<String> list = new ArrayList();

			for (int j = 0; j < N; j++) {

				list.add(sc.next());

			}

			int instruct_count = sc.nextInt();
			
			

			for (int j = 0; j < instruct_count; j++) {

				sc.next();
				
				int x = sc.nextInt(); // ÀÎµ¦½º

				int y = sc.nextInt(); // »ðÀÔ ¼ýÀÚ °¹¼ö

				for (int k = 0; k < y; k++) { // y°³ ¸¸Å­ ¹Ýº¹

					list.add(x + k, sc.next());

				}

			}
			
			System.out.print("#"+i);
			
			for (int j = 0; j < 10; j++) {
				
				
				System.out.print(" "+list.get(j));
			}
			
			
			System.out.println();

			
			
			
			
			
			
			
			
			

		}

	}

}
