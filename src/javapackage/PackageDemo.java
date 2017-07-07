package javapackage;

import java.io.IOException;
import java.lang.reflect.Method;

public class PackageDemo {

	public static void main(String[] args) {
		
		
		/*System.out.println(PackageDemo.class.getName());
		System.out.println( PackageDemo.class.getPackage());
		
		Method[] method=PackageDemo.class.getMethods();
		for(int i=0;i<method.length;i++){
			System.out.println(method[i].getName());
		}
		
		System.out.println();*/
		
		
		//ceil(double) 
		//floor(double)  
		//round(double)
		
		/*System.out.println("ceil :" + Math.ceil(1.4));
		System.out.println("floor"+ Math.floor(1.7));
		System.out.println("down round " + Math.round(1.4));
		System.out.println("up round " + Math.round(1.5));
		
		
		System.out.println("cos " +Math.cos(0));
		System.out.println("Sin "+ Math.sin(90));
		System.out.println( "Log10 "  +Math.log10(10));
		System.out.println("Log " + Math.log(2.7375));
		System.out.println("exp " +Math.exp(6));
		
		System.out.println("pow " + Math.pow(20, 20));
		System.out.println("square roof " +Math.sqrt(16));
		
	
		System.out.println("radom number " + Math.round((Math.random()*50)));*/
		
		
		/*try {
			Runtime.getRuntime().exec("shutdown -r -t 1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		StringBuilder builder=new StringBuilder();
		builder.append("I'm java deveolper");
		System.out.println(builder.capacity());
		
		builder.replace(4, 8, "C#");
		System.out.println("repace "+ builder.toString());
		
		builder.delete(0, 3);
		System.out.println(builder.toString());
		
	}
	
	public void show(){
		
	}
}
