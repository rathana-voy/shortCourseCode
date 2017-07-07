package inheritance;

public class EmployeeForm extends Form{

	@Override
	public void print() {
		System.out.println("print employee form");
		
	}

	@Override
	public void preview() {
		System.out.println("preview employee form");
	}

}
