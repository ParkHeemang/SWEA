package problem1178;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrList = new ArrayList<String>();

		while (true) {

			String input = sc.nextLine();

			if (input.equals(""))
				break;
			else {

				arrList.add(input);
			}
		}
		
		for (int i = 0; i < arrList.size(); i++) {
			
			System.out.println(arrList.get(i).toString());
			
		}
		

	}

}
