
public class combination {

	static int[] an = {1, 2, 3, 4, 5};
	static int[] tr;

	public static void main(String[] args) {

		int n = 5;
		int r = 3;

		tr = new int[r];
		
		comb(5,3);

	}

	static public void comb(int n, int r) {

		if (r == 0) {

			for (int i = 0; i < tr.length; i++) {
				System.out.print(tr[i] + " ");				
			}
			System.out.println();

		} else if (n < r) {

			return;

		} else {

			tr[r - 1] = an[n - 1];
			comb(n - 1, r - 1);
			comb(n - 1, r);

		}

	}
 
}
