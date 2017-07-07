
public class FinalDemo extends Printable{
	final int age;
	
	public FinalDemo(){
		age=19;
	}
	//cannot override
	/*public void print(){
		
	}*/
	public static void main(String[] args) {
		
		FinalDemo demo=new FinalDemo();
		//demo.age=20;//error 
		System.out.println(demo.age);
		Math m=new Math();
	
		int x=10;
		int y=0;
		if(x==10){
			y=x;
		}
		System.out.println(y);
		
	}
	
}

class Printable {
	final void print(){
		System.out.println("print in call printable");
	}
}

 class Math extends Printable{
	
}


