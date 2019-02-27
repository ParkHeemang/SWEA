package static_practice;

public class Counter {
	
	static int count = 0;
	String name = "counter";
	
	public Counter() {
		
		this.count++;                         //여기서 this는 
		
		System.out.println("생성자 메소드 " + this.count);
		System.out.println("생성자 메소드 " + this.name);
	}
	
	public static int getCount() {
		return count;
		
		
	}
	
	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Child_Counter c3 = new Child_Counter();
		System.out.println(c3.count);
		
		
		System.out.println("Counter.getCount() : "+Counter.getCount());
		System.out.println("Child_Counter.getCount() : "+Child_Counter.getCount());
	}
	

}
