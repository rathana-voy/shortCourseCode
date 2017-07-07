
public class StaticDemo {

	private static String schoolName;
	private static String name;
	private int id;
	static int bikeSpeed;
	static String color;
	
	static{
		System.out.println("static block execute");
		/*bikeSpeed=90;
		color="white";*/
	}
	
	public static void SetName(String name){
		StaticDemo.name=name;
		StaticDemo demo=new StaticDemo(); 
		demo.id=10;
	}
	
	public static void main(String[] args) throws InvalidAge {
		System.out.println("main execute");
		
		
		/*StaticDemo demo=new StaticDemo();
		StaticDemo.schoolName="HRD";
		System.out.println(StaticDemo.schoolName);
		StaticDemo.SetName("Dara");
		//StaticDemo.bikeSpeed=60;
		System.out.println("BikeSpeed : "+StaticDemo.bikeSpeed);*/
		
		
		/*Student stu=new Student();
		stu.setName("thida");
		stu.setAge(1);
		System.out.println(stu);*/
		
		Table t=new Table();
		DipositThread thread=new DipositThread("thread 1",t, 10);
		DipositThread thread2=new DipositThread("thread 2",t, 0);
		
		thread.start();
		thread2.start();
	}
	
}
