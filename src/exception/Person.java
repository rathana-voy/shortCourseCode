package exception;

public class Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age)throws InvalidAge {
		
	if(age<=0 || age>= 150) throw new InvalidAge("Invalid age!");
		this.age = age;
	}
	
	
}
