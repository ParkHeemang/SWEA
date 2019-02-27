package Exception;

public class Test {
	public void sayNick(String nick) throws FoolException {
		// 예외 발생 여지가 생겼기 때문에 try,catch 처리
		if ("fool".equals(nick)) {
			throw new FoolException(); // 예외를 발생 시켜라
		}
		System.out.println("당신의 별명은 " + nick + " 입니다.");

	}

	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.sayNick("fool");
			test.sayNick("genious");
		} catch (FoolException e) {
			
			e.printStackTrace();
		}
		

	}
}