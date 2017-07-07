
public class OuterStatic {

	int x=10;
	
	static class InnerClass{
		int x;
		static String School="HRD";
		void print(){
			OuterStatic outer=new OuterStatic();
			System.out.println(this.x);
			System.out.println(InnerClass.School);
			System.out.println(outer.x);
		}
	}
	
	public void display(){
		OuterStatic.InnerClass inner= new OuterStatic.InnerClass();
		inner.print();
	}
	
	public static void main(String[] args) {
		
		OuterStatic.InnerClass inner= new OuterStatic.InnerClass();
		
		inner.print();
		
	}
}
