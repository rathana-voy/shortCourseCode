package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		SerializeDemo demo=new SerializeDemo();
		demo.readObject();
	}
	
	public void writeObject(){
		File f=new File("E:\\car.bin");
		
		try(OutputStream ous=new FileOutputStream(f);
			ObjectOutput objout=new ObjectOutputStream(ous)){
			
			Car car=new Car();
			
			car.setColor("Black");
			car.setEnginPower(6.5f);
			car.setModel("2017");
			objout.writeObject(car);
			System.out.println("Done!");
		}catch(Exception e){
			System.out.println("fialture!");
			e.printStackTrace();
		}
	}
	public void readObject(){
		File f=new File("E:\\car.bin");
		
		try(InputStream ous=new FileInputStream(f);
			ObjectInput objin=new ObjectInputStream(ous)){
			
			Car car= (Car) objin.readObject();
			
			System.out.println("Color: "+car.getColor());
			System.out.println("Model: "+car.getModel());
			System.out.println("Power: "+car.getEnginPower());
			
		}catch(Exception e){
			System.out.println("fialture!");
			e.printStackTrace();
		}
	}
}
