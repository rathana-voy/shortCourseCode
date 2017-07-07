
public class OuterClass {
	private int x=10;
	
	void show(){
		InnerClass inner=new InnerClass();
		inner.print();
	}
	
	class InnerClass{
		int x=6;
		void print(){
			int x=1;
			System.out.println("Local V:"+ x);
			System.out.println("Instance V: " + this.x);
			System.out.println("Instance V: " + OuterClass.this.x);
		}
	}
	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		//OuterClass.InnerClass inner = outer.new InnerClass();
		//inner.print();
		
		outer.show();
		
		
	}
	
}
