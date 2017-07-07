
public class LocalInnerClass {
	int x=10;
	public void display(){
		int age;
		class Local{
			String name;
			void print(){
				this.name="SreyNy";
				System.out.println(this.name);
				System.out.println(LocalInnerClass.this.x);
				//System.out.println(age);
				//System.out.println(this);
			}
		}
		new Local().print(); /*=>*/ Local local =new Local();
		local.print();
		
	}
	public static void main(String[] args) {
		LocalInnerClass local=new LocalInnerClass();
		local.display();
	}
	
}
