package exception;

public class CheckExceptionDemo {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Nita");
		try {
			p.setAge(21);
			System.out.println("in try block");
		} catch (InvalidAge e) {

			System.out.println("in catch block");
			e.printStackTrace();
		}
	}
}
