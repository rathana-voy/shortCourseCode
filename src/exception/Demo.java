package exception;

public class Demo {
	public static void main(String[] args) {
		CustomException C=new CustomException();
		try{
			C.setName("Kaka");
			System.out.println(C.getName());
		}catch(NameError e){
			System.out.println(e);
		}
		try{
			C.setPassword("12345678");
			System.out.println(C.getPassword());
		}catch(PasswordError e){
			System.out.println(e);
		}
		
	}
}
