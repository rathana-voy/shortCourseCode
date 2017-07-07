
public class Student {

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
	public void setAge(int age) throws InvalidAge {
		if(age<=0) throw new InvalidAge("IlligalAgeException! age cannot smaller then number 0");
		else this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
