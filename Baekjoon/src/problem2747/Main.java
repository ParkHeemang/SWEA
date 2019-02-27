package problem2747;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(pivo(sc.nextInt()));
	}

	public static int pivo(int n) {
		if (n == 0)return 0;
		if (n == 1)return 1;
		return pivo(n - 1) + pivo(n - 2);

	}

}
