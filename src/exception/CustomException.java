package exception;

public class CustomException {
	private int id;
	private String name;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws NameError{
		char[] c;
		c=name.toCharArray();
		if(!Character.isUpperCase(c[0]))throw new NameError("Must capital letter!");
		else this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws PasswordError{
		if(password.length()<8)throw new PasswordError("less than 8 character");
		else this.password = password;
	}
	
	
}
