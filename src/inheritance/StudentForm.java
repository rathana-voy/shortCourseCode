package inheritance;

import java.util.HashMap;
import java.util.StringTokenizer;

public class StudentForm extends Form{

	
	public void print() {
		System.out.println("printing student form");
		
	}

	@Override
	public void preview() {
		System.out.println("preview student form");
	}

	public void show(){
		this.preview();
	}
	
	public void show(String smg){
		System.out.println(smg);
	}
	
	public int sum(int a,int b,int c){
		return a+b+c;
	}
	
	public int sum(int a,int b){
		System.out.println("method sum override on sum on Form");
		return a+b;
	}
	
	public static void display(){
		System.out.println("display method in class student form");
	}
	public static void main(String[] args) {

		/*StudentForm student=new StudentForm();
		Form studentForm =null;
		
		studentForm=new StudentForm();
		
		student.print();
		student.preview();
		
		studentForm.preview();
		studentForm.print();
		System.out.println(studentForm.sum(3, 5));
		
		studentForm =new EmployeeForm();
		studentForm.preview();
		studentForm.print();
		
		//test overloading method
		student.show();
		student.show("complie time polymorphism");
		
		System.out.println(student.sum(1, 4, 5));
		System.out.println(student.sum(1, 5));*/
		
		
		Form student=new StudentForm();
		student.display();
		student.print();
		
		HashMap map=new HashMap<>();
		
	}
}
