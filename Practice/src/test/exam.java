package test;

public class exam {

	public static void main(String[] args) {

		for (int i1 = 1; i1 <= 3; i1++) {				//ù��° ��Ҹ� ���� �ݺ���

			for (int i2 = 1; i2 <= 2; i2++) {			//�ι�° ��Ҹ� ���� �ݺ���

				if (i2 != i1) {

					for (int i3 = 0; i3 <= 3; i3++) {	//����° ��Ҹ� ���� �ݺ���

						if (i3 != i1 && i3 != i2) {

							System.out.println(i1 + "," + i2 + "," + i3);
						}

					}
				}

			}

		}

	}

}