package Exception;

public class Test {
	public void sayNick(String nick) throws FoolException {
		// ���� �߻� ������ ����� ������ try,catch ó��
		if ("fool".equals(nick)) {
			throw new FoolException(); // ���ܸ� �߻� ���Ѷ�
		}
		System.out.println("����� ������ " + nick + " �Դϴ�.");

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