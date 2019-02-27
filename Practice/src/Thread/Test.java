package Thread;

public class Test extends Thread{ 
	
	int seq;
	public Test(int seq) {
		this.seq = seq;
	}
	public void run() {
		System.out.println(this.seq+1+"번째"+" thread start.");		
		try {
			Thread.sleep(1000);						//1초
		} catch (InterruptedException e) {
			
			
		}
		System.out.println(this.seq+1+"번째"+ " thread end.");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			Thread t = new Test(i);
			t.start();
			
		}
		System.out.println("main end.");

	}

}
