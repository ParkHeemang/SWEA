package problem1427;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();

		String[] from_array = Integer.toString(input_num).split("");

		int[] array = new int[from_array.length];

		for (int i = 0; i < from_array.length; i++) {

			array[i] = Integer.parseInt(from_array[i]);

		}

		Arrays.sort(array);

		int[] array_copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {

			array_copy[i] = array[i];

		}

		for (int i = 0; i < array.length; i++) {

			array[i] = array_copy[array.length - 1 - i];
		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i]);

		}

	}

}
