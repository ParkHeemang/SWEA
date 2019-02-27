package test;

public class exam {

	public static void main(String[] args) {

		for (int i1 = 1; i1 <= 3; i1++) {				//첫번째 요소를 도는 반복문

			for (int i2 = 1; i2 <= 2; i2++) {			//두번째 요소를 도는 반복문

				if (i2 != i1) {

					for (int i3 = 0; i3 <= 3; i3++) {	//세번째 요소를 도는 반복문

						if (i3 != i1 && i3 != i2) {

							System.out.println(i1 + "," + i2 + "," + i3);
						}

					}
				}

			}

		}

	}

}
