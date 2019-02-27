package static_practice;


class Singleton {
	private static Singleton one;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(one==null) {								//이전에 이 클래스를 사용해 만든 인스턴스가 없으면 하나 만들고
			one = new Singleton();
		}											
		
		return one;									//one을 return
													//결과적으로 처음에 만든 Singleton 객체만 return 하게됨
	}
}


public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();    //static 변수 one 이 null이 아니기때문에 이전에 있던 one 반환
		System.out.println(singleton1 == singleton2);
	}

}
