package exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExecptionDemo {

	public static void main(String[] args) {
		/*List<String> list =new ArrayList<>();
		list.add("Dara");
		list.add("male");
		//list.add("PP");
		try{
			for(int i=0;i<=2;i++){
				System.out.println(list.get(i));
			}
			System.out.println("under error");
			
		}catch(Exception ex){
			ex.printStackTrace();
			list.add("tt");
		}
		finally{
			System.out.println("finally block executed");
		}
	
		//===use list object====
		//list.remove("male");
		System.out.println("=========reuse list above========");
		list.forEach(a-> {System.out.println(a);});
		for(String s:list){
			System.out.println(s);
		}*/
		
		
		/*BufferedReader bf=null;
		try{
			bf=new BufferedReader(new FileReader("E:\\resourse.txt"));
			System.out.println(bf.readLine());
		}catch(FileNotFoundException e){
			e.printStackTrace();
			File file=new File("E:\\resourse.txt");
			if(!file.exists()){
				try {
					file.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		
		//try with resourse
		try(
				BufferedReader buff= new BufferedReader(new FileReader("E:\\resourse.txt"));
				InputStream in=new FileInputStream( new File(""));
				){
			System.out.println(buff.readLine());
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}
