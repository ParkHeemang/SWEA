package test;

public class exam2 {

	static int[] arr = { 1, 2, 3, 4 }; // arr[] : �����Ͱ� ����� �迭

	public static void main(String[] args) {

		// ��� ȣ���� ���� ���� ����

		// swap(i,j): arr[i] <--��ȯ--> arr[j]

		perm(4, 0);

	}

	// {1,2,3,4}

	private static void perm(int n, int k) {
		if (k == n) {

			System.out.print("k==n : ");
			for (int i = 0; i < arr.length; i++) {

				System.out.print(arr[i] + " ");

			}

			System.out.println();
		} else {
			for (int i = k; i <= n - 1; i++) {
				
				

				System.out.print("swap(" + k + "," + i + "): ");
				swap(k, i);

				for (int j = 0; j < arr.length; j++) {

					System.out.print(arr[j] + " ");

				}

				System.out.println();
				System.out.println("perm(" + n + "," + k + " + 1)");
				perm(n, k + 1);

				System.out.print("swap(" + k + "," + i + "): ");
				swap(k, i);

				for (int j = 0; j < arr.length; j++) {

					System.out.print(arr[j] + " ");

				}

				System.out.println();
				
				System.out.println("i�� ������Ű�ڽ��ϴ�.");
			}

		}

	}

	private static void swap(int k, int i) {
		int temp = arr[k];
		arr[k] = arr[i];
		arr[i] = temp;

	}

}