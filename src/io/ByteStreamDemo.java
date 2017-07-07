package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamDemo {

	public static void main(String[] args) {
		ByteStreamDemo demo=new ByteStreamDemo();
		//demo.readDataAsByte();
		
		demo.writeDataToFileAsByte();
	}
	
	public void writeDataToFileAsByte(){
		OutputStream ous=null;
		try{
			ous=new FileOutputStream("E:\\history.txt");
			long start =System.currentTimeMillis()/1_000;
			
			byte[] b=ByteStreamDemo.S.getBytes();
			for(int i=0;i<100;i++){
				ous.write(b);
			}
			long end =System.currentTimeMillis()/1_000;
			System.out.println(start);
			System.out.println(end);
			System.out.println(end-start);
			ous.flush();
			System.out.println("Done!");
		}catch(Exception e){
			System.out.println("unsuccess!");
			e.printStackTrace();
		}finally{
			try{
				ous.close();
			}catch(Exception e){}
			
		}
	}
	
	public void readDataAsByte(){
		
		try( InputStream in =new FileInputStream("E:\\history.txt")){
			int ch;
			while((ch=in.read()) != -1){
				System.out.print((char)ch);
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void readDataAsChar(){
		try(FileReader reader =new FileReader("E:\\history.txt")){
			int ch;
			while((ch=reader.read()) !=-1){
				System.out.print((char)ch);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void WriteDataAsChar(){
		try(FileWriter writer =new FileWriter("E:\\history.txt")){
			
			long start =System.currentTimeMillis()/1_000;
			for(int i=0 ;i<100;i++){
				writer.write(ByteStreamDemo.S+"\r\n");
			}
			long end =System.currentTimeMillis()/1_000;
			System.out.println(end-start);
			System.out.println("Done!");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("fialture!");
		}
	}
	
	static final String S  ="The class declaration consists of the class name, the class header (specifying its type parameters, the primary constructor etc.) and the class body, surrounded by curly braces. Both the header and the body are optional; if the class has no body, curly braces can be omitted."
			+ "A class in Kotlin can have a primary constructor and one or more secondary constructors. The primary constructor is part of the class header: it goes after the class name (and optional type parameters)."
			+ "Note that parameters of the primary constructor can be used in the initializer blocks. They can also be used in property initializers declared in the class body:"
			+ "If the constructor has annotations or visibility modifiers, the constructor keyword is required, and the modifiers go before it:"
			+ "Much the same way as regular properties, the properties declared in the primary constructor can be mutable (var) or read-only (val)."
			+ "If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor, either directly or indirectly through another secondary constructor(s). Delegation to another constructor of the same class is done using the this keyword:"
			+ "If a non-abstract class does not declare any constructors (primary or secondary), it will have a generated primary constructor with no arguments. The visibility of the constructor will be public. If you do not want your class to have a public constructor, you need to declare an empty primary constructor with non-default visibility:";

			
}
