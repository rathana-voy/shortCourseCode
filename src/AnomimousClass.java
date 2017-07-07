
public class AnomimousClass {

	
	
	public static void main(String[] args) {
		
		String name="name";
		Abstract a = new Abstract() {
			int age;
			@Override
			void display() {
				age=10;
				System.out.println("Anomimous class");
				System.out.println(age);
				System.out.println(name);
				show();
			}
			public void show(){
				System.out.println("new method in anomimous");
			}
		};
		
		//a.display();
		
		///other way to impliments
		A aa=new A();
		Abstract aaa=new A();
		aa.display();
		aa.show();
		aaa.display();
	}
}

abstract class Abstract{
	abstract void display();
}

class A extends Abstract{
	@Override
	void display() {
		System.out.println("method display in class A");
		//show();
	}
	
	void show(){
		
	}
}
