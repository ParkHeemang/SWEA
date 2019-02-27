package static_practice;


class Singleton {
	private static Singleton one;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(one==null) {								//������ �� Ŭ������ ����� ���� �ν��Ͻ��� ������ �ϳ� �����
			one = new Singleton();
		}											
		
		return one;									//one�� return
													//��������� ó���� ���� Singleton ��ü�� return �ϰԵ�
	}
}


public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();    //static ���� one �� null�� �ƴϱ⶧���� ������ �ִ� one ��ȯ
		System.out.println(singleton1 == singleton2);
	}

}
