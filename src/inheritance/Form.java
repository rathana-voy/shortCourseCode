package inheritance;

public abstract class Form {

	public abstract void print();
	public abstract void preview();
	
	public int sum(int a, int b){
		return a+b;
	}
	
	public static void display(){
		System.out.println("display method in class form");
	}
}
