package problem1181;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.nextLine();

		String[] array = new String[N];

		for (int i = 0; i < N; i++) {

			array[i] = sc.nextLine();

		}

		List<String> answer_list = new ArrayList();

		for (int i = 1; i <= 50; i++) {

			List<String> list1 = new ArrayList();
			for (int j = 0; j < array.length; j++) {

				if (array[j].length() == i) {

					list1.add(array[j]);

				}

			}

			Collections.sort(list1, String.CASE_INSENSITIVE_ORDER);

			for (int j = 0; j < list1.size(); j++) {

				answer_list.add(list1.get(j));

			}

		}

		List result1 = answer_list.stream().distinct().collect(Collectors.toList());

		for (int i = 0; i < result1.size(); i++) {

			System.out.println(result1.get(i));

		}

	}

}
